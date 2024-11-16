package com.s1scottd.WeatherForecastApp.utils;

import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.Period;
import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.WeatherForecastResponse;

public class WeatherForecastConverter {
  public static WeatherForecastResponse weatherForecastPeriod2WeatherForecastResponse(Period weatherForecastPeriod) {
    WeatherForecastResponse response = new WeatherForecastResponse();
    response.setNumber(weatherForecastPeriod.getNumber());
    response.setName(weatherForecastPeriod.getName());
    response.setStartTime(weatherForecastPeriod.getStartTime());
    response.setEndTime(weatherForecastPeriod.getEndTime());
    response.setDaytime(weatherForecastPeriod.isDaytime());
    response.setTemperature(weatherForecastPeriod.getTemperature());
    response.setTemperatureUnit(weatherForecastPeriod.getTemperatureUnit());
    response.setTemperatureTrend(weatherForecastPeriod.getTemperatureTrend());
    response.setProbabilityOfPrecipitation(weatherForecastPeriod.getProbabilityOfPrecipitation());
    response.setWindSpeed(weatherForecastPeriod.getWindSpeed());
    response.setWindDirection(weatherForecastPeriod.getWindDirection());
    response.setIcon(weatherForecastPeriod.getIcon());
    response.setShortForecast(weatherForecastPeriod.getShortForecast());
    response.setDetailedForecast(weatherForecastPeriod.getDetailedForecast());

    return response;
  }
}
