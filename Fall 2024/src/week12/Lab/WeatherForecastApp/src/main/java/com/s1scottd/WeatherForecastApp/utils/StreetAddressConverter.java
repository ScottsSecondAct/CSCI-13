package com.s1scottd.WeatherForecastApp.utils;

import com.s1scottd.WeatherForecastApp.dtos.StreetAddressCreateRequest;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressResponse;
import com.s1scottd.WeatherForecastApp.models.StreetAddress;

public class StreetAddressConverter {
  public static StreetAddress streetAddressCreateRequest2StreetAddress(StreetAddressCreateRequest streetAddressCreateRequest) {
    StreetAddress streetAddress = new StreetAddress();
    streetAddress.setNumber(streetAddressCreateRequest.getNumber());
    streetAddress.setStreet(streetAddressCreateRequest.getStreet());
    streetAddress.setCity(streetAddressCreateRequest.getCity());
    streetAddress.setState(streetAddressCreateRequest.getState());
    streetAddress.setZipCode(streetAddressCreateRequest.getZipCode());

    return streetAddress;
  }

  public static StreetAddressResponse streetAddress2StreetAddressResponse(StreetAddress streetAddress) {
    StreetAddressResponse streetAddressResponseDto = new StreetAddressResponse();
    streetAddressResponseDto.setId(streetAddress.getId());
    streetAddressResponseDto.setNumber(streetAddress.getNumber());
    streetAddressResponseDto.setStreet(streetAddress.getStreet());
    streetAddressResponseDto.setCity(streetAddress.getCity());
    streetAddressResponseDto.setState(streetAddress.getState());
    streetAddressResponseDto.setZipCode(streetAddress.getZipCode());

    return streetAddressResponseDto;
  }
}
