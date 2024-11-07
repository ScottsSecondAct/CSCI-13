package com.s1scottd.WeatherForecastApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s1scottd.WeatherForecastApp.models.StreetAddress;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressReadDto;
import com.s1scottd.WeatherForecastApp.utils.StreetAddressParser;
import com.s1scottd.WeatherForecastApp.repositiories.StreetAddressRepository;
import com.s1scottd.WeatherForecastApp.services.StreetAddressServiceInterface;

@Service
public class StreetAddressService implements StreetAddressServiceInterface {

  private final StreetAddressRepository streetAddressRepository;

  @Autowired
  public StreetAddressService(StreetAddressRepository streetAddressRepository) {
      this.streetAddressRepository = streetAddressRepository;
  }

  // public StreetAddress saveStreetAddress(StreetAddressDto jsonString) {
  //   StreetAddressParser streetAddressParser = new StreetAddressParser();
  //   StreetAddress streetAddress = streetAddressParser.ToStreetAddressObject(jsonString);
  //   return streetAddressRepository.save(streetAddress);
  // }

  public StreetAddress saveStreetAddress(StreetAddressDto streetAddressDto) {
    StreetAddress streetAddress = new StreetAddress();
    streetAddress.setNumber(streetAddressDto.getNumber());
    streetAddress.setStreet(streetAddressDto.getStreet());
    streetAddress.setCity(streetAddressDto.getCity());
    streetAddress.setState(streetAddressDto.getState());
    streetAddress.setZipCode(streetAddressDto.getZipCode());
    streetAddress.setCountry(streetAddressDto.getCountry());
    return streetAddressRepository.save(streetAddress);
  }

  public Optional<StreetAddress> getStreetAddressById(Long id) {
    return streetAddressRepository.findById(id);
  }

  public List<StreetAddress> getStreetAddresses() {
    return streetAddressRepository.findAll();
  }

  public void deleteStreetAddress(Long id) {
    streetAddressRepository.deleteById(id);
  }

  public long countStreetAddresses() {
    return streetAddressRepository.count();
  }
}
