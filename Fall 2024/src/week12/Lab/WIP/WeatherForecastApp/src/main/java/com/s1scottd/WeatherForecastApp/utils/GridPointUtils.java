package com.s1scottd.WeatherForecastApp.utils;

import java.util.Optional;

import com.s1scottd.WeatherForecastApp.dtos.GridPoint.GridPoint;
import com.s1scottd.WeatherForecastApp.dtos.GridPoint.Properties;
import com.s1scottd.WeatherForecastApp.dtos.Location.Location;
import com.s1scottd.WeatherForecastApp.clients.GridPointApiClient;
import com.s1scottd.WeatherForecastApp.utils.GridPointUtils;

public class GridPointUtils {

  public static String getGridId(GridPoint gridPoint) {
    Properties properties = gridPoint.getProperties();
    if (properties != null) {
      return properties.getGridId();
    }
    return null;
  }

  public static int getGridX(GridPoint gridPoint) {
    Properties properties = gridPoint.getProperties();
    if (properties != null) {
      return properties.getGridX();
    }
    return -1; // Return a default value if properties are not set
  }

  public static int getGridY(GridPoint gridPoint) {
    Properties properties = gridPoint.getProperties();
    if (properties != null) {
      return properties.getGridY();
    }
    return -1; // Return a default value if properties are not set
  }

  public static Optional<GridPoint> getGridPoint(Location location) {
    GridPointApiClient client = new GridPointApiClient();
    Optional<String> gridPointString = client.getGridPoint(location, 0);

    if (gridPointString.isPresent()) {
      GridPointParser gridPointParser = new GridPointParser();
      return Optional.of(gridPointParser.ToGridPointObject(gridPointString.get()));
    }

    return Optional.empty();
  }
}
