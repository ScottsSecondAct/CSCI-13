package com.s1scottd.WeatherForecastApp.services;

import java.util.List;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressCreateRequest;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressResponseDto;
import com.s1scottd.WeatherForecastApp.models.StreetAddress;

public interface IStreetAddressService {

  StreetAddressResponseDto saveStreetAddress(StreetAddressCreateRequest streetAddressCreateRequest);

  StreetAddressResponseDto getStreetAddressResponseDtoById(Long id);

  StreetAddress getStreetAddressById(Long id);

  List<StreetAddressResponseDto> getStreetAddresses();

  void deleteStreetAddress(Long id);

  long countStreetAddresses();

}