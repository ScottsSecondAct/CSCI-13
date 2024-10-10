package weatherapiapp.WeatherForecast;

import java.util.List;

public class Properties {
  private String units;
  private String forecastGenerator;
  private String generatedAt;
  private String updateTime;
  private String validTimes;
  private Elevation elevation;
  private List<Period> periods;

  // Default constructor
  public Properties() {
  }

  // Parameterized constructor
  public Properties(String units, String forecastGenerator, String generatedAt, String updateTime,
      String validTimes, Elevation elevation, List<Period> periods) {
    this.units = units;
    this.forecastGenerator = forecastGenerator;
    this.generatedAt = generatedAt;
    this.updateTime = updateTime;
    this.validTimes = validTimes;
    this.elevation = elevation;
    this.periods = periods;
  }

  // Getters and setters
  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }

  public String getForecastGenerator() {
    return forecastGenerator;
  }

  public void setForecastGenerator(String forecastGenerator) {
    this.forecastGenerator = forecastGenerator;
  }

  public String getGeneratedAt() {
    return generatedAt;
  }

  public void setGeneratedAt(String generatedAt) {
    this.generatedAt = generatedAt;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public String getValidTimes() {
    return validTimes;
  }

  public void setValidTimes(String validTimes) {
    this.validTimes = validTimes;
  }

  public Elevation getElevation() {
    return elevation;
  }

  public void setElevation(Elevation elevation) {
    this.elevation = elevation;
  }

  public List<Period> getPeriods() {
    return periods;
  }

  public void setPeriods(List<Period> periods) {
    this.periods = periods;
  }
}