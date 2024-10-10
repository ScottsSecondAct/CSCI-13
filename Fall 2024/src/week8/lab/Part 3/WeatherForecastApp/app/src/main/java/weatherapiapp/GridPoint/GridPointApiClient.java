package weatherapiapp.GridPoint;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;
import java.io.IOException;
import java.time.Duration;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import weatherapiapp.WeatherForecast.WeatherForecastApiClient;
import weatherapiapp.Location.Location;

public class GridPointApiClient {
  // protected static final Logger logger = LogManager.getLogger();
  private static final Logger LOGGER = Logger.getLogger(WeatherForecastApiClient.class.getName());
  private static final String BASE_URL = "https://api.weather.gov/points/";

  public Optional<String> getGridPoint(Location location, int index) {
    String apiUri = String.format(BASE_URL + "%.4f,%.4f", location.getLatitude(index), location.getLongitude(index));

    HttpClient client = HttpClient.newBuilder()
        .connectTimeout(Duration.ofSeconds(10)) // Set a timeout for connection
        .followRedirects(HttpClient.Redirect.NORMAL) // Follow 301/302 redirects automatically
        .build();

    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(apiUri))
        .timeout(Duration.ofSeconds(10)) // Set a timeout for the request
        .GET()
        .build();

    try {
      // Send the request and receive the response
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      if (response.statusCode() == 200) {
        return Optional.of(response.body());
      } else {
        LOGGER.log(Level.WARNING, "Failed to get grid point. HTTP status code: {0}", response.statusCode());
        //logger.warning("Failed to get grid point. HTTP status code: {0}", response.statusCode());
        return Optional.empty();
      }
    } catch (HttpTimeoutException e) {
      LOGGER.log(Level.SEVERE,"Request timed out: {0}", e.getMessage());
    } catch (IOException e) {
      LOGGER.log(Level.SEVERE, "I/O error during the request: {0}", e.getMessage());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt(); // Restore interrupt status
      LOGGER.log(Level.SEVERE,"Request was interrupted: {0}", e.getMessage());
    } catch (Exception e) {
      LOGGER.log(Level.SEVERE,"An unexpected error occurred: {0}", e.getMessage());
    }

    return Optional.empty();
  }
}