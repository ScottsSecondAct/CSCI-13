/*
 * This source file was generated by the Gradle 'init' task
 */
package weatherapiapp;

import weatherapiapp.WeatherForecast.WeatherForecast;

public class App {

    public static void main(String[] args) {
        WeatherForecast weatherForecast = WeatherForecast.getWeatherForecast();
        weatherForecast.printWeatherForecastForWeek();
    }
}