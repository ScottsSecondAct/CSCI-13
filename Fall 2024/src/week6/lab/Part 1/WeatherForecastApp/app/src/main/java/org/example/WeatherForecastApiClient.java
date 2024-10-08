package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;
import java.time.Duration;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WeatherForecastApiClient {
  private static final String API_URI = "https://api.weather.gov/gridpoints//STO/53,76/forecast";
  private static final Logger LOGGER = Logger.getLogger(WeatherForecastApiClient.class.getName());

  public Optional<String> getWeatherForecast() {
    HttpClient client = HttpClient.newBuilder()
        .connectTimeout(Duration.ofSeconds(10)) // Set a timeout for connection
        .build();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(API_URI))
        .timeout(Duration.ofSeconds(10)) // Set a timeout for the request
        .GET()
        .build();

    try {
      // Send the request and receive the response
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      if (response.statusCode() == 200) {
        return Optional.of(response.body());
      } else {
        LOGGER.log(Level.WARNING, "Failed to get weather forecast. HTTP status code: {0}", response.statusCode());
        return Optional.empty();
      }
    } catch (HttpTimeoutException e) {
      LOGGER.log(Level.SEVERE, "Request timed out: {0}", e.getMessage());
    } catch (IOException e) {
      LOGGER.log(Level.SEVERE, "I/O error during the request: {0}", e.getMessage());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt(); // Restore interrupt status
      LOGGER.log(Level.SEVERE, "Request was interrupted: {0}", e.getMessage());
    } catch (Exception e) {
      LOGGER.log(Level.SEVERE, "An unexpected error occurred: {0}", e.getMessage());
    }

    return Optional.empty();
  }
}
