package com.s1scottd.WeatherForecastApp.services;

import org.springframework.stereotype.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.WeatherForecast;
import com.s1scottd.WeatherForecastApp.clients.WeatherForecastApiClient;
import com.s1scottd.WeatherForecastApp.models.GridLocation;
import com.s1scottd.WeatherForecastApp.models.StreetAddress;
import com.s1scottd.WeatherForecastApp.utils.WeatherForecastParser;

@Service
public class WeatherForecastService implements IWeatherForecastService {

  private final IStreetAddressService streetAddressService;

  @Autowired
  public WeatherForecastService(IStreetAddressService streetAddressService) {
    this.streetAddressService = streetAddressService;
  }

  @Override
  public WeatherForecast getWeatherForecastById(Long id) {
    StreetAddress streetAddress = streetAddressService.getStreetAddressById(id);

    if (streetAddress != null) {
      Optional<WeatherForecast> forecast = getWeatherForecast(streetAddress.getGridLocation());
      if (forecast.isPresent()) {
        return forecast.get();
      } else {
        return null;
      }
    }
    return null;
  }

  public static Optional<WeatherForecast> getWeatherForecast(GridLocation gridLocation) {

    WeatherForecastApiClient client = new WeatherForecastApiClient();
    Optional<String> forecast = client.getWeatherForecast(gridLocation);

    if (forecast.isPresent()) {
      WeatherForecastParser weatherForecastParser = new WeatherForecastParser();
      return Optional.of(weatherForecastParser.ToWeatherForecastObject(forecast.get()));
    } else {
      return Optional.empty();
    }
  }
}
