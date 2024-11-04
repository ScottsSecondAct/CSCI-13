package com.s1scottd.WeatherForecastApp.utils;

import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.WeatherForecast;
import com.s1scottd.WeatherForecastApp.dtos.GridPoint.GridPoint;
import com.s1scottd.WeatherForecastApp.clients.WeatherForecastApiClient;

import java.util.Optional;

public class WeatherForecastUtils {
  public static Optional<WeatherForecast> getWeatherForecast(GridPoint gridPoint) {
    WeatherForecastApiClient client = new WeatherForecastApiClient();
    Optional<String> forecast = client.getWeatherForecast(gridPoint);

    if (forecast.isPresent()) {
      WeatherForecastParser weatherForecastParser = new WeatherForecastParser();
      return Optional.of(weatherForecastParser.ToWeatherForecastObject(forecast.get()));
    } else {
      return Optional.empty();
    }
  }
}
