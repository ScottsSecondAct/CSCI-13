package com.s1scottd.WeatherForecastApp.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.Period;
import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.WeatherForecast;
import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.WeatherForecastResponse;
import com.s1scottd.WeatherForecastApp.clients.WeatherForecastApiClient;
import com.s1scottd.WeatherForecastApp.models.GridLocation;
import com.s1scottd.WeatherForecastApp.models.StreetAddress;
import com.s1scottd.WeatherForecastApp.utils.WeatherForecastConverter;
import com.s1scottd.WeatherForecastApp.utils.WeatherForecastParser;
import com.s1scottd.WeatherForecastApp.utils.WeatherForecastUtils;

@Service
public class WeatherForecastService implements IWeatherForecastService {

  @Autowired
  private IStreetAddressService streetAddressService;

  @Autowired
  private WeatherForecastApiClient weatherForecastApiClient;

  @Autowired
  private WeatherForecastParser weatherForecastParser;

  @Override
  public Optional<List<WeatherForecastResponse>> getWeatherForecastResponsesById(Long id) {
    // get the street address by id
    Optional<StreetAddress> streetAddress = streetAddressService.getStreetAddressById(id);

    if (!streetAddress.isPresent()) {
      return Optional.empty();
    }

    // get the grid location from the street address
    GridLocation gridLocation = streetAddress.get().getGridLocation();

    // get the weather forecast from the grid location
    Optional<WeatherForecast> weatherForecast = getWeatherForecast(gridLocation);

    if (!weatherForecast.isPresent()) {
      return Optional.empty();
    }

    // convert the WeatherForecast object to a List of WeatherForecastResponse object
    List<WeatherForecastResponse> weatherForecastResponses = new ArrayList<>();
    List<Period> periods = WeatherForecastUtils.getPeriods(weatherForecast.get());
    for (Period period : periods) {
      WeatherForecastResponse weatherForecastResponse = new WeatherForecastResponse();
      weatherForecastResponse = WeatherForecastConverter.weatherForecastPeriod2WeatherForecastResponse(period);
      weatherForecastResponses.add(weatherForecastResponse);
    }

    // return the WeatherForecastResponse object
    return Optional.of(weatherForecastResponses);
  }

  public Optional<WeatherForecast> getWeatherForecast(GridLocation gridLocation) {
    Optional<String> forecast = weatherForecastApiClient.getWeatherForecast(gridLocation);

    if (forecast.isPresent()) {
      return Optional.of(weatherForecastParser.toWeatherForecastObject(forecast.get()));
    } else {
      return Optional.empty();
    }
  }
}
