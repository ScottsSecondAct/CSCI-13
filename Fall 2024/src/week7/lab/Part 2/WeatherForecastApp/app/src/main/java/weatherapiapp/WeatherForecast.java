package weatherapiapp;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherForecast {
  @JsonProperty("@context")
  private List<Object> context;
  private String type;
  private Geometry geometry;
  private Properties properties;

  // Default constructor
  public WeatherForecast() {
  }

  // Parameterized constructor
  public WeatherForecast(List<Object> context, String type, Geometry geometry, Properties properties) {
    this.context = context;
    this.type = type;
    this.geometry = geometry;
    this.properties = properties;
  }

  // Getters and setters
  public List<Object> getContext() {
    return context;
  }

  public void setContext(List<Object> context) {
    this.context = context;
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

  // Inner classes
  public static class Geometry {
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

  public static class Properties {
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

  public static class Elevation {
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

  public static class Period {
    private int number;
    private String name;
    private String startTime;
    private String endTime;
    @JsonProperty("isDaytime")
    private boolean daytime;
    private int temperature;
    private String temperatureUnit;
    private String temperatureTrend;
    private ProbabilityOfPrecipitation probabilityOfPrecipitation;
    private String windSpeed;
    private String windDirection;
    private String icon;
    private String shortForecast;
    private String detailedForecast;

    // Default constructor
    public Period() {
    }

    // Parameterized constructor
    public Period(int number, String name, String startTime, String endTime, boolean isDaytime, int temperature,
        String temperatureUnit, String temperatureTrend, ProbabilityOfPrecipitation probabilityOfPrecipitation,
        String windSpeed, String windDirection, String icon, String shortForecast, String detailedForecast) {
      this.number = number;
      this.name = name;
      this.startTime = startTime;
      this.endTime = endTime;
      this.daytime = isDaytime;
      this.temperature = temperature;
      this.temperatureUnit = temperatureUnit;
      this.temperatureTrend = temperatureTrend;
      this.probabilityOfPrecipitation = probabilityOfPrecipitation;
      this.windSpeed = windSpeed;
      this.windDirection = windDirection;
      this.icon = icon;
      this.shortForecast = shortForecast;
      this.detailedForecast = detailedForecast;
    }

    // Getters and setters
    public int getNumber() {
      return number;
    }

    public void setNumber(int number) {
      this.number = number;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getStartTime() {
      return startTime;
    }

    public void setStartTime(String startTime) {
      this.startTime = startTime;
    }

    public String getEndTime() {
      return endTime;
    }

    public void setEndTime(String endTime) {
      this.endTime = endTime;
    }

    public boolean isDaytime() {
      return daytime;
    }

    public void setDaytime(boolean isDaytime) {
      this.daytime = isDaytime;
    }

    public int getTemperature() {
      return temperature;
    }

    public void setTemperature(int temperature) {
      this.temperature = temperature;
    }

    public String getTemperatureUnit() {
      return temperatureUnit;
    }

    public void setTemperatureUnit(String temperatureUnit) {
      this.temperatureUnit = temperatureUnit;
    }

    public String getTemperatureTrend() {
      return temperatureTrend;
    }

    public void setTemperatureTrend(String temperatureTrend) {
      this.temperatureTrend = temperatureTrend;
    }

    public ProbabilityOfPrecipitation getProbabilityOfPrecipitation() {
      return probabilityOfPrecipitation;
    }

    public void setProbabilityOfPrecipitation(ProbabilityOfPrecipitation probabilityOfPrecipitation) {
      this.probabilityOfPrecipitation = probabilityOfPrecipitation;
    }

    public String getWindSpeed() {
      return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
      this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
      return windDirection;
    }

    public void setWindDirection(String windDirection) {
      this.windDirection = windDirection;
    }

    public String getIcon() {
      return icon;
    }

    public void setIcon(String icon) {
      this.icon = icon;
    }

    public String getShortForecast() {
      return shortForecast;
    }

    public void setShortForecast(String shortForecast) {
      this.shortForecast = shortForecast;
    }

    public String getDetailedForecast() {
      return detailedForecast;
    }

    public void setDetailedForecast(String detailedForecast) {
      this.detailedForecast = detailedForecast;
    }

@Override
public String toString() {
    // Define the desired format for date-time output
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss z");

    // Parse the start and end time strings into ZonedDateTime
    ZonedDateTime start = ZonedDateTime.parse(startTime);
    ZonedDateTime end = ZonedDateTime.parse(endTime);

    // Format the date-time strings using the defined formatter
    String formattedStartTime = start.format(formatter);
    String formattedEndTime = end.format(formatter);

    StringBuilder sb = new StringBuilder();
    sb.append("Forecast for ").append(name).append(":\n");
    sb.append("Start Time: ").append(formattedStartTime).append("\n");
    sb.append("End Time: ").append(formattedEndTime).append("\n");
    sb.append("Daytime: ").append(daytime ? "Yes" : "No").append("\n");
    sb.append("Temperature: ").append(temperature).append(" ").append(temperatureUnit).append("\n");
    if (temperatureTrend != null && !temperatureTrend.isEmpty()) {
        sb.append("Temperature Trend: ").append(temperatureTrend).append("\n");
    }
    sb.append("Wind: ").append(windSpeed).append(" from ").append(windDirection).append("\n");
    sb.append("Short Forecast: ").append(shortForecast).append("\n");
    sb.append("Detailed Forecast: ").append(detailedForecast).append("\n");

    if (probabilityOfPrecipitation != null && probabilityOfPrecipitation.getValue() != null) {
        sb.append("Precipitation Probability: ").append(probabilityOfPrecipitation.getValue()).append("%").append("\n");
    } else {
        sb.append("Precipitation Probability: N/A\n");
    }

    sb.append("Icon: ").append(icon).append("\n");

    return sb.toString();
}
  }

  public static class ProbabilityOfPrecipitation {
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
}
