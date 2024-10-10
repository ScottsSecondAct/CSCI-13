package weatherapiapp.Location;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Benchmark {
  @JsonProperty("isDefault")
  private boolean defaultValue;
  private String benchmarkDescription;
  private String id;
  private String benchmarkName;

  public Benchmark() {
  }

  // Getters and Setters for Benchmark
  public boolean getDefault() {
    return defaultValue;
  }

  public void setDefault(boolean isDefault) {
    this.defaultValue = isDefault;
  }

  public String getBenchmarkDescription() {
    return benchmarkDescription;
  }

  public void setBenchmarkDescription(String benchmarkDescription) {
    this.benchmarkDescription = benchmarkDescription;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getBenchmarkName() {
    return benchmarkName;
  }

  public void setBenchmarkName(String benchmarkName) {
    this.benchmarkName = benchmarkName;
  }
}
