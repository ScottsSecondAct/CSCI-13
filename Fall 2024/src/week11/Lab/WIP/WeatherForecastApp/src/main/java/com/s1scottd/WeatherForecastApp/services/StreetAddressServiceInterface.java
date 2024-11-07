package com.s1scottd.WeatherForecastApp.services;

import java.util.List;
import java.util.Optional;

import com.s1scottd.WeatherForecastApp.models.StreetAddress;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressDto;

public interface StreetAddressServiceInterface {

  public StreetAddress saveStreetAddress(StreetAddressDto streetAddressDto);

  public Optional<StreetAddress> getStreetAddressById(Long id);

  public List<StreetAddress> getStreetAddresses();

  public void deleteStreetAddress(Long id);

  public long countStreetAddresses();
}
