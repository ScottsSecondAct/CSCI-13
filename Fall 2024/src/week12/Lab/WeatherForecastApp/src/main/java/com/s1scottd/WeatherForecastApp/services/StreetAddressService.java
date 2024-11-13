package com.s1scottd.WeatherForecastApp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s1scottd.WeatherForecastApp.models.GridLocation;
import com.s1scottd.WeatherForecastApp.models.StreetAddress;
import com.s1scottd.WeatherForecastApp.clients.GridPointApiClient;
import com.s1scottd.WeatherForecastApp.clients.LocationApiClient;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressCreateRequest;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressResponse;
import com.s1scottd.WeatherForecastApp.dtos.GridPoint.GridPoint;
import com.s1scottd.WeatherForecastApp.dtos.Location.Location;
import com.s1scottd.WeatherForecastApp.repositiories.StreetAddressRepository;
import com.s1scottd.WeatherForecastApp.utils.GridPointParser;
import com.s1scottd.WeatherForecastApp.utils.LocationParser;
import com.s1scottd.WeatherForecastApp.utils.StreetAddressConverter;

@Service
public class StreetAddressService implements IStreetAddressService {

  private final StreetAddressRepository streetAddressRepository;

  @Autowired
  public StreetAddressService(StreetAddressRepository streetAddressRepository) {
    this.streetAddressRepository = streetAddressRepository;
  }

  @Override
  public StreetAddressResponse saveStreetAddress(StreetAddressCreateRequest streetAddressCreateRequest) {
    // Convert a StreetAddressCreateRequest object to a StreetAddress object
    StreetAddress streetAddress = StreetAddressConverter.streetAddressCreateRequest2StreetAddress(streetAddressCreateRequest);

    // Get the GridPoint object for the street address
    Optional<GridPoint> gridPoint = getGridPoint(streetAddress);
    if (gridPoint.isEmpty()) {
      return null;
    }

    // Convert the GridPoint object to GridLocation object
    GridLocation gridLocation = new GridPointParser().getGridLocation(gridPoint.get());

    // Store the GridPoint object in the Street Address object
    streetAddress.setGridLocation(gridLocation);
    StreetAddress savedStreetAddress = streetAddressRepository.save(streetAddress);

    return StreetAddressConverter.streetAddress2StreetAddressResponse(savedStreetAddress);
  }


  // Get a grid point for a street address
  Optional<GridPoint> getGridPoint(StreetAddress streetAddress) {
    // Convert the street address to a location
    LocationApiClient locationApiClient = new LocationApiClient();
    Optional<String> locationString = locationApiClient.getLocation(streetAddress);
    if (locationString.isEmpty()) {
      return Optional.empty();
    }
    LocationParser locationParser = new LocationParser();
    Location location = locationParser.ToLocationObject(locationString.get());
    if (location == null) {
      return Optional.empty();
    }

    // Convert the location to a grid point
    GridPointApiClient gridPointApiClient = new GridPointApiClient();
    Optional<String> gridPointString = gridPointApiClient.getGridPoint(location, 0);
    if (gridPointString.isEmpty()) {
      return Optional.empty();
    }
    GridPointParser gridPointParser = new GridPointParser();
    GridPoint gridPoint = gridPointParser.ToGridPointObject(gridPointString.get());
    if (gridPoint == null) {
      return Optional.empty();
    }

    return Optional.of(gridPoint);
  }

  @Override
  public StreetAddress getStreetAddressById(Long id) {
    Optional<StreetAddress> streetAddress = streetAddressRepository.findById(id);

    if (streetAddress.isPresent()) {
      return streetAddress.get();
    }
    return null;
  }

    @Override
  public StreetAddressResponse getStreetAddressResponseById(Long id) {
    Optional<StreetAddress> streetAddress = streetAddressRepository.findById(id);

    if (streetAddress.isPresent()) {
      return StreetAddressConverter.streetAddress2StreetAddressResponse(streetAddress.get());
    }
    return null;
  }

  @Override
  public List<StreetAddressResponse> getStreetAddresses() {
    List<StreetAddress> streetAddresses = streetAddressRepository.findAll();

    List<StreetAddressResponse> streetAddressResponseDtos = new ArrayList<>();
    for (StreetAddress streetAddress : streetAddresses) {
      StreetAddressResponse streetAddressResponseDto = StreetAddressConverter
          .streetAddress2StreetAddressResponse(streetAddress);
      streetAddressResponseDtos.add(streetAddressResponseDto);
    }
    return streetAddressResponseDtos;
  }

  @Override
  public void deleteStreetAddress(Long id) {
    streetAddressRepository.deleteById(id);
  }

  @Override
  public long countStreetAddresses() {
    return streetAddressRepository.count();
  }
}
