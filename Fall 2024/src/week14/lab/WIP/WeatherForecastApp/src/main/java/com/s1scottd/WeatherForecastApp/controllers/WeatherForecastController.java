package com.s1scottd.WeatherForecastApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.*;
import com.s1scottd.WeatherForecastApp.services.IWeatherForecastService;
//import com.s1scottd.WeatherForecastApp.services.WeatherForecastService;

@RestController
@RequestMapping("/api/weatherforecast")
public class WeatherForecastController {

  private final IWeatherForecastService weatherForecastService;

  @Autowired
  public WeatherForecastController(IWeatherForecastService weatherForecastService) {
    this.weatherForecastService = weatherForecastService;
  }

  @GetMapping("/")
  public String index() {
    return "Greetings from the Weather Forecast API.";
  }

  @GetMapping("/{id}")
  public WeatherForecast getWeatherForecastById(@PathVariable Long id) {
    return weatherForecastService.getWeatherForecastById(id);
  }
}