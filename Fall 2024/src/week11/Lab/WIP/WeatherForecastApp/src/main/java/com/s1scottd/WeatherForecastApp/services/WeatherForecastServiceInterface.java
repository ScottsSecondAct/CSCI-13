package com.s1scottd.WeatherForecastApp.services;

import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.*;

public interface WeatherForecastServiceInterface {

  public WeatherForecast getWeatherForecastById(Long id);
}
