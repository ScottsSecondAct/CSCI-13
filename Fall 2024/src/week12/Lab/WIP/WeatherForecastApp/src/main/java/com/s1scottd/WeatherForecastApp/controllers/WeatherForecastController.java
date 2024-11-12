package com.s1scottd.WeatherForecastApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.*;
import com.s1scottd.WeatherForecastApp.services.IWeatherForecastService;
import com.s1scottd.WeatherForecastApp.services.WeatherForecastService;

@RestController
@RequestMapping("/api/weatherforecast")
public class WeatherForecastController {

  @Autowired
  private final IWeatherForecastService weatherForecastService;

  public WeatherForecastController(WeatherForecastService weatherForecastService) {
    this.weatherForecastService = weatherForecastService;
  }

  @GetMapping("/")
  public String index() {
    return "Greetings from the Weather Forecast API.";
  }

  @GetMapping("/{id}")
  public WeatherForecast getWeatherByLocationId(@PathVariable Long id) {
    return weatherForecastService.getWeatherForecastById(id);
  }
}