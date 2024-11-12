package com.s1scottd.WeatherForecastApp.services;

import org.springframework.stereotype.Service;

import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.WeatherForecast;

@Service
public class WeatherForecastService implements IWeatherForecastService {

  @Override
  public WeatherForecast getWeatherForecastById(Long id)
  {
    return null;
  }

  // public static Optional<WeatherForecast> getWeatherForecast(GridPoint
  // gridPoint) {
  // WeatherForecastApiClient client = new WeatherForecastApiClient();
  // Optional<String> forecast = client.getWeatherForecast(gridPoint);

  // if (forecast.isPresent()) {
  // WeatherForecastParser weatherForecastParser = new WeatherForecastParser();
  // return
  // Optional.of(weatherForecastParser.ToWeatherForecastObject(forecast.get()));
  // } else {
  // return Optional.empty();
  // }
  // }

  // public void printWeatherForecastForWeek() {
  // Properties properties = getProperties();

  // StringBuilder sb = new StringBuilder();

  // for (Period period : properties.getPeriods()) {
  // sb.append(period.toString()).append("\n");
  // sb.append("\n");
  // }
  // System.out.println(sb.toString());
  // }
}

