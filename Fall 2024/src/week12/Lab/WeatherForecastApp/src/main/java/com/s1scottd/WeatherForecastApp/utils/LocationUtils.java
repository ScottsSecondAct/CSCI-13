package com.s1scottd.WeatherForecastApp.utils;

import java.util.Optional;

import com.s1scottd.WeatherForecastApp.dtos.Location.Location;
import com.s1scottd.WeatherForecastApp.clients.LocationApiClient;

public class LocationUtils {

  // Helper method to get the longitude at the specified index
  public static double getLongitude(Location location, int index) {
    if (location != null && location.getResult() != null
      && location.getResult().getAddressMatches() != null
      && index >= 0 && index < location.getResult().getAddressMatches().size()) {
      return location.getResult().getAddressMatches().get(index).getCoordinates().getX();
    } else {
      throw new IndexOutOfBoundsException("Invalid index or no address matches available.");
    }
  }

  // Helper method to get the latitude at the specified index
  public static double getLatitude(Location location, int index) {
    if (location != null && location.getResult() != null
      && location.getResult().getAddressMatches() != null
      && index >= 0 && index < location.getResult().getAddressMatches().size()) {
      return location.getResult().getAddressMatches().get(index).getCoordinates().getY();
    } else {
      throw new IndexOutOfBoundsException("Invalid index or no address matches available.");
    }
  }

  public static Optional<Location> getLocation(String addressString) {
    LocationApiClient locationApiClient = new LocationApiClient();
    Optional<String> locationString = locationApiClient.getLocation(addressString);

    if (locationString.isPresent()) {
      LocationParser locationParser = new LocationParser();
      return Optional.of(locationParser.ToLocationObject(locationString.get()));
    } else {
      return Optional.empty();
    }
  }
}

