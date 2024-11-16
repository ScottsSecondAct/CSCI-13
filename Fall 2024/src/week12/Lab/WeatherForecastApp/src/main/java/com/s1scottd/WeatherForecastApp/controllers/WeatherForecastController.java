package com.s1scottd.WeatherForecastApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.*;
import com.s1scottd.WeatherForecastApp.exception.ResourceNotFoundException;
import com.s1scottd.WeatherForecastApp.services.IWeatherForecastService;

@RestController
@RequestMapping("/api/weatherforecast")
public class WeatherForecastController {

  @Autowired
  private IWeatherForecastService weatherForecastService;

  @GetMapping("/")
  public String index() {
    return "Greetings from the Weather Forecast API.";
  }

  @GetMapping("/{id}")
  public ResponseEntity<List<WeatherForecastResponse>> getWeatherForecastById(@PathVariable Long id) {
    List<WeatherForecastResponse> weatherForecastList = weatherForecastService.getWeatherForecastResponsesById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Weather Forecast not found for id: " + id));
    return ResponseEntity.ok(weatherForecastList);
  }
}