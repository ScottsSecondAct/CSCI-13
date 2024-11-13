package com.s1scottd.WeatherForecastApp.utils;

import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.WeatherForecast;
import com.s1scottd.WeatherForecastApp.dtos.WeatherForecast.Period;

public class WeatherForecastPrinter {

    public void printWeatherForecastForWeek(WeatherForecast weatherForecast) {
        StringBuilder sb = new StringBuilder();
        for (Period period : weatherForecast.getProperties().getPeriods()) {
            sb.append(period.toString()).append("\n\n");
        }
        System.out.println(sb.toString());
    }
}

