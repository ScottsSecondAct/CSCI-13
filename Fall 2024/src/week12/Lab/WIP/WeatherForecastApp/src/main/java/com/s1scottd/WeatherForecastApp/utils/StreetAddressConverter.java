package com.s1scottd.WeatherForecastApp.utils;

import com.s1scottd.WeatherForecastApp.dtos.StreetAddressCreateRequest;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressResponseDto;
import com.s1scottd.WeatherForecastApp.models.StreetAddress;

public class StreetAddressConverter {
  public static StreetAddress streetAddressRequestDto2StreetAddress(StreetAddressCreateRequest streetAddressCreateRequest) {
    StreetAddress streetAddress = new StreetAddress();
    streetAddress.setNumber(streetAddressCreateRequest.getNumber());
    streetAddress.setStreet(streetAddressCreateRequest.getStreet());
    streetAddress.setCity(streetAddressCreateRequest.getCity());
    streetAddress.setState(streetAddressCreateRequest.getState());
    streetAddress.setZipCode(streetAddressCreateRequest.getZipCode());
    streetAddress.setCountry(streetAddressCreateRequest.getCountry());

    return streetAddress;
  }

  public static StreetAddressResponseDto streetAddress2StreetAddressResponseDto(StreetAddress streetAddress) {
    StreetAddressResponseDto streetAddressResponseDto = new StreetAddressResponseDto();
    streetAddressResponseDto.setId(streetAddress.getId());
    streetAddressResponseDto.setNumber(streetAddress.getNumber());
    streetAddressResponseDto.setStreet(streetAddress.getStreet());
    streetAddressResponseDto.setCity(streetAddress.getCity());
    streetAddressResponseDto.setState(streetAddress.getState());
    streetAddressResponseDto.setZipCode(streetAddress.getZipCode());
    streetAddressResponseDto.setCountry(streetAddress.getCountry());
    
    return streetAddressResponseDto;
  }
}
