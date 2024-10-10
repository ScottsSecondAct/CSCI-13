/**
 * MIT License
 *
 * Copyright (c) 2024 Scott Davis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
 
package weatherapiapp.GridPoint;

import com.fasterxml.jackson.annotation.JsonProperty;

import weatherapiapp.Location.Location;

import java.util.List;
import java.util.Optional;

public class GridPoint {

  @JsonProperty("@context")
  private List<Object> context;
  private String id;
  private String type;
  private Geometry geometry;
  private Properties properties;

  // Default constructor
  public GridPoint() {
  }

  // Getters and setters
  public List<Object> getContext() {
    return context;
  }

  public void setContext(List<Object> context) {
    this.context = context;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Geometry getGeometry() {
    return geometry;
  }

  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }

  public Properties getProperties() {
    return properties;
  }

  public void setProperties(Properties properties) {
    this.properties = properties;
  }

  // Helper methods
  public String getGridId() {
    if (properties != null) {
      return properties.getGridId();
    }
    return null;
  }

  public int getGridX() {
    if (properties != null) {
      return properties.getGridX();
    }
    return -1; // Return a default value if properties are not set
  }

  public int getGridY() {
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
