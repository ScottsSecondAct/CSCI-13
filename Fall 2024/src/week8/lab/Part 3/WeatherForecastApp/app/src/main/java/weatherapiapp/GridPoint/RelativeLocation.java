package weatherapiapp.GridPoint;

public class RelativeLocation {
  private String type;
  private Geometry geometry;
  private RelativeLocationProperties properties;

  // Default constructor
  public RelativeLocation() {
  }

  // Getters and setters
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

  public RelativeLocationProperties getProperties() {
    return properties;
  }

  public void setProperties(RelativeLocationProperties properties) {
    this.properties = properties;
  }
}
