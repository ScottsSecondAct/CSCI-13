package com.s1scottd.WeatherForecastApp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s1scottd.WeatherForecastApp.models.StreetAddress;
import com.s1scottd.WeatherForecastApp.clients.GridPointApiClient;
import com.s1scottd.WeatherForecastApp.clients.LocationApiClient;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressCreateRequest;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressResponseDto;
import com.s1scottd.WeatherForecastApp.dtos.GridPoint.GridPoint;
import com.s1scottd.WeatherForecastApp.dtos.Location.Location;
import com.s1scottd.WeatherForecastApp.repositiories.StreetAddressRepository;
import com.s1scottd.WeatherForecastApp.utils.GridPointParser;
import com.s1scottd.WeatherForecastApp.utils.GridPointUtils;
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
  public StreetAddressResponseDto saveStreetAddress(StreetAddressCreateRequest streetAddressCreateRequest) {
    // Get the gridId, gridX and gridY

    StreetAddress streetAddress = StreetAddressConverter.streetAddressRequestDto2StreetAddress(streetAddressCreateRequest);

    Optional<GridPoint> gridPoint = getGridPoint(streetAddress);
    if (gridPoint.isEmpty()) {
      return null;
    }

    streetAddress.setGridId(GridPointUtils.getGridId(gridPoint.get()));
    streetAddress.setGridX(GridPointUtils.getGridX(gridPoint.get()));
    streetAddress.setGridY(GridPointUtils.getGridY(gridPoint.get()));
    StreetAddress savedStreetAddress = streetAddressRepository.save(streetAddress);

    return StreetAddressConverter.streetAddress2StreetAddressResponseDto(savedStreetAddress);
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
  public StreetAddressResponseDto getStreetAddressById(Long id) {
    Optional<StreetAddress> streetAddress = streetAddressRepository.findById(id);

    if (streetAddress.isPresent()) {
      StreetAddressResponseDto streetAddressResponseDto = StreetAddressConverter
          .streetAddress2StreetAddressResponseDto(streetAddress.get());
      return streetAddressResponseDto;
    }
    return null;
  }

  @Override
  public List<StreetAddressResponseDto> getStreetAddresses() {
    List<StreetAddress> streetAddresses = streetAddressRepository.findAll();

    List<StreetAddressResponseDto> streetAddressResponseDtos = new ArrayList<>();
    for (StreetAddress streetAddress : streetAddresses) {
      StreetAddressResponseDto streetAddressResponseDto = StreetAddressConverter
          .streetAddress2StreetAddressResponseDto(streetAddress);
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
