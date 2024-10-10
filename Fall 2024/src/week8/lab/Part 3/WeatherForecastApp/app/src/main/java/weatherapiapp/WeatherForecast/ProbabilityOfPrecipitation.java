package weatherapiapp.WeatherForecast;

public class ProbabilityOfPrecipitation {
  private String unitCode;
  private Double value;

  // Default constructor
  public ProbabilityOfPrecipitation() {
  }

  // Parameterized constructor
  public ProbabilityOfPrecipitation(String unitCode, Double value) {
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

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }
}
