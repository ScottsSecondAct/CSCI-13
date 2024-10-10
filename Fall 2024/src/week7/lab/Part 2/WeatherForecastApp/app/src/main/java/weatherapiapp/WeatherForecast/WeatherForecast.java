package weatherapiapp.WeatherForecast;

import java.util.List;
import java.util.Optional;
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

  public static WeatherForecast getWeatherForecast() {
    WeatherForecastApiClient client = new WeatherForecastApiClient();
    Optional<String> forecast = client.getWeatherForecast();

    if (forecast.isPresent()) {
      WeatherForecastParser weatherForecastParser = new WeatherForecastParser();
      return weatherForecastParser.ToWeatherForecastObject(forecast.get());
    }

    return null;
  }

  public void printWeatherForecastForWeek() {
    Properties properties = getProperties();

    StringBuilder sb = new StringBuilder();

    for (Period period : properties.getPeriods()) {
      sb.append(period.toString()).append("\n");
      sb.append("\n");
    }
    System.out.println(sb.toString());
  }
}
