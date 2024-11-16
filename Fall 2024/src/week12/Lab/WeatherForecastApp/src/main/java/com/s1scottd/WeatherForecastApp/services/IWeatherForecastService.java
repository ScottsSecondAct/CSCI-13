package com.s1scottd.WeatherForecastApp.services;

import java.util.List;
import java.util.Optional;

import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.*;

public interface IWeatherForecastService {

  public Optional<List<WeatherForecastResponse>> getWeatherForecastResponsesById(Long id);
}
