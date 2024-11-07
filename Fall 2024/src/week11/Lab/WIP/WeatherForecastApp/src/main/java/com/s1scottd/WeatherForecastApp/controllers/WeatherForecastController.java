package com.s1scottd.WeatherForecastApp.controllers;

import java.util.List;
import java.util.Optional;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.s1scottd.WeatherForecastApp.models.StreetAddress;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressReadDto;
import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.*;
import com.s1scottd.WeatherForecastApp.services.WeatherForecastService;
import com.s1scottd.WeatherForecastApp.services.StreetAddressService;
import com.s1scottd.WeatherForecastApp.utils.StreetAddressParser;

@RestController
@RequestMapping("/api/")
public class WeatherForecastController {

  @Autowired
  private final WeatherForecastService weatherForecastService;

  @Autowired
  private final StreetAddressService streetAddressService;

  public WeatherForecastController(WeatherForecastService weatherForecastService, StreetAddressService streetAddressService) {
    this.weatherForecastService = weatherForecastService;
    this.streetAddressService = streetAddressService;
  }

  @GetMapping("/")
  public String index() {
    return "Greetings from the Weather Forecast Web Application.";
  }

  @GetMapping("/weatherforecast/{id}")
  public WeatherForecast getWeatherByLocationId(@PathVariable Long id) {
    // Logic to retrieve forecast by location ID
    return weatherForecastService.getWeatherForecastById(id);
  }

  @GetMapping("/street-address/{id}")
  public Optional<StreetAddress> getStreetAddressById(@PathVariable Long id) {
    // Logic to retrieve forecast by address ID
    Optional<StreetAddress> streetAddress = streetAddressService.getStreetAddressById(id);
    if (streetAddress.isPresent()) {
      return streetAddress;
    } else {
      return Optional.empty();
    }
  }

  @GetMapping("/street-addresses")
  public List<StreetAddress> getAllStreetAddresses() {
    return streetAddressService.getStreetAddresses();
  }

  @PostMapping("/street-address")
  public ResponseEntity<HashMap<StreetAddress, Long>> setStreetAddress(@RequestBody StreetAddressReadDto streetAddressReadDto) {

    StreetAddress streetAddress = streetAddressService.saveStreetAddress(streetAddressReadDto);

    if (streetAddress != null) {
      HashMap<StreetAddress, Long> map = new HashMap<>();
      map.put(streetAddress, streetAddress.getId());
      return new ResponseEntity<>(map, HttpStatus.CREATED);
    }
    return new ResponseEntity<>(new HashMap<>(), HttpStatus.BAD_REQUEST);
  }
}