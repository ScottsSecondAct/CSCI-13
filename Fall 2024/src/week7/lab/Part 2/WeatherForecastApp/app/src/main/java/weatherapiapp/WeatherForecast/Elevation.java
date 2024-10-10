package weatherapiapp.WeatherForecast;

public class Elevation {
  private String unitCode;
  private double value;

  // Default constructor
  public Elevation() {
  }

  // Parameterized constructor
  public Elevation(String unitCode, double value) {
    this.unitCode = unitCode;
    this.value = value;
  }

  // Getters and setters
  public String getUnitCode() {
    return unitCode;
  }

  public void setUnitCode(String unitCode) {
    this.unitCode = unitCode;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }
}
