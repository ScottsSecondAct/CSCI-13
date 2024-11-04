package com.s1scottd.WeatherForecastApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.WeatherForecast;
import com.s1scottd.WeatherForecastApp.services.WeatherForecastServiceInterface;

@Service
public class WeatherForecastService implements WeatherForecastServiceInterface {

  @Override
  public WeatherForecast getWeatherForecastById(Long id)
  {
    return null;
  }
}
