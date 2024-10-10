package weatherapiapp.GridPoint;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Distance {

  @JsonProperty("unitCode")
  private String unitCode;

  private double value;

  // Default constructor
  public Distance() {
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