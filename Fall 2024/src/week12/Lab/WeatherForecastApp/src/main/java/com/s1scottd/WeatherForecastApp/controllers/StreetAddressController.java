package com.s1scottd.WeatherForecastApp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.s1scottd.WeatherForecastApp.dtos.StreetAddressCreateRequest;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressResponse;
import com.s1scottd.WeatherForecastApp.services.IStreetAddressService;
import com.s1scottd.WeatherForecastApp.services.StreetAddressService;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/street-address")
public class StreetAddressController {
  private static final Logger LOGGER = Logger.getLogger(StreetAddressController.class.getName());

  @Autowired
  private final IStreetAddressService streetAddressService;

  public StreetAddressController(StreetAddressService streetAddressService) {
    this.streetAddressService = streetAddressService;
  }

  @GetMapping("/")
  public ResponseEntity<List<StreetAddressResponse>> getAllStreetAddresses() {
    return new ResponseEntity<>(streetAddressService.getStreetAddresses(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<StreetAddressResponse> getStreetAddressById(@PathVariable Long id) {
    StreetAddressResponse streetAddressResponse = streetAddressService.getStreetAddressResponseById(id);
    if (streetAddressResponse != null) {
      return new ResponseEntity<>(streetAddressResponse, HttpStatus.CREATED);
    } else {
      return new ResponseEntity<>(new StreetAddressResponse(), HttpStatus.BAD_REQUEST);
    }
  }

  @PostMapping("/")
  public ResponseEntity<StreetAddressResponse> setStreetAddress(@RequestBody StreetAddressCreateRequest streetAddressCreateRequest) {
    StreetAddressResponse streetAddressResponseDto = streetAddressService.saveStreetAddress(streetAddressCreateRequest);

    if (streetAddressResponseDto != null) {
      return new ResponseEntity<>(streetAddressResponseDto, HttpStatus.CREATED);
    }
    return new ResponseEntity<>(new StreetAddressResponse(), HttpStatus.BAD_REQUEST);
  }
}