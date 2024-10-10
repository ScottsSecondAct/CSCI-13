package weatherapiapp.GridPoint;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bearing {

  @JsonProperty("unitCode")
  private String unitCode;

  private int value;

  // Default constructor
  public Bearing() {
  }

  // Getters and setters
  public String getUnitCode() {
    return unitCode;
  }

  public void setUnitCode(String unitCode) {
    this.unitCode = unitCode;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
