package com.s1scottd.WeatherForecastApp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.s1scottd.WeatherForecastApp.dtos.StreetAddressCreateRequest;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressResponseDto;
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
  public ResponseEntity<List<StreetAddressResponseDto>> getAllStreetAddresses() {
    return new ResponseEntity<>(streetAddressService.getStreetAddresses(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<StreetAddressResponseDto> getStreetAddressById(@PathVariable Long id) {
    StreetAddressResponseDto streetAddressResponseDto = streetAddressService.getStreetAddressResponseById(id);
    if (streetAddressResponseDto != null) {
      return new ResponseEntity<>(streetAddressResponseDto, HttpStatus.CREATED);
    } else {
      return new ResponseEntity<>(new StreetAddressResponseDto(), HttpStatus.BAD_REQUEST);
    }
  }

  @PostMapping("/")
  public ResponseEntity<StreetAddressResponseDto> setStreetAddress(@RequestBody StreetAddressCreateRequest streetAddressCreateRequest) {
    LOGGER.log(Level.INFO, "streetAddressCreateRequest: " + streetAddressCreateRequest.toString());
    StreetAddressResponseDto streetAddressResponseDto = streetAddressService.saveStreetAddress(streetAddressCreateRequest);

    if (streetAddressResponseDto != null) {
      return new ResponseEntity<>(streetAddressResponseDto, HttpStatus.CREATED);
    }
    return new ResponseEntity<>(new StreetAddressResponseDto(), HttpStatus.BAD_REQUEST);
  }
}