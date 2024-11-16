package com.s1scottd.WeatherForecastApp.utils;

import java.util.List;

import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.Period;
import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.WeatherForecast;

public class WeatherForecastUtils {
  public static List<Period> getPeriods(WeatherForecast weatherForecast) {
    return weatherForecast.getProperties().getPeriods();
  }

}
