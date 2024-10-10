package weatherapiapp.WeatherForecast;

import java.util.List;

public class Geometry {
  private String type;
  private List<List<List<Double>>> coordinates;

  // Default constructor
  public Geometry() {
  }

  // Parameterized constructor
  public Geometry(String type, List<List<List<Double>>> coordinates) {
    this.type = type;
    this.coordinates = coordinates;
  }

  // Getters and setters
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public List<List<List<Double>>> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<List<List<Double>>> coordinates) {
    this.coordinates = coordinates;
  }
}
