package com.s1scottd.WeatherForecastApp.services;

import java.util.List;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressCreateRequest;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressResponse;
import com.s1scottd.WeatherForecastApp.models.StreetAddress;

public interface IStreetAddressService {

  StreetAddressResponse saveStreetAddress(StreetAddressCreateRequest streetAddressCreateRequest);

  StreetAddressResponse getStreetAddressResponseById(Long id);

  StreetAddress getStreetAddressById(Long id);

  List<StreetAddressResponse> getStreetAddresses();

  void deleteStreetAddress(Long id);

  long countStreetAddresses();

}