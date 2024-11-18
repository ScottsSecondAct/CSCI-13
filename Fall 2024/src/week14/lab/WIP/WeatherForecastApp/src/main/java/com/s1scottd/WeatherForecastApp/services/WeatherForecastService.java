package com.s1scottd.WeatherForecastApp.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.WeatherForecast;
import com.s1scottd.WeatherForecastApp.dtos.GridPoint.GridPoint;
import com.s1scottd.WeatherForecastApp.models.StreetAddress;

@Service
public class WeatherForecastService implements IWeatherForecastService {

  private final IStreetAddressService streetAddressService;

  @Autowired
  public WeatherForecastService(IStreetAddressService streetAddressService) {
    this.streetAddressService = streetAddressService;
  }

  @Override
  public WeatherForecast getWeatherForecastById(Long id)
  {
    StreetAddress streetAddress = streetAddressService.getStreetAddressById(id);

    if (streetAddress != null) {
      return getWeatherForecast(streetAddress.getGridPoint());
    } else {
      return null;
    }
  }

  public static Optional<WeatherForecast> getWeatherForecast(GridPoint gridPoint) {
  WeatherForecastApiClient client = new WeatherForecastApiClient();
  Optional<String> forecast = client.getWeatherForecast(gridPoint);

  if (forecast.isPresent()) {
  WeatherForecastParser weatherForecastParser = new WeatherForecastParser();
  return
  Optional.of(weatherForecastParser.ToWeatherForecastObject(forecast.get()));
  } else {
  return Optional.empty();
  }
  }

  public void printWeatherForecastForWeek() {
  Properties properties = getProperties();

  StringBuilder sb = new StringBuilder();

  for (Period period : properties.getPeriods()) {
  sb.append(period.toString()).append("\n");
  sb.append("\n");
  }
  System.out.println(sb.toString());
  }
}

