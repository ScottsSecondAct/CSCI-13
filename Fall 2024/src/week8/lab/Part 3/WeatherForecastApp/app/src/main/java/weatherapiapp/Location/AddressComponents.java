package weatherapiapp.Location;

public class AddressComponents {
  private String zip;
  private String streetName;
  private String preType;
  private String city;
  private String preDirection;
  private String suffixDirection;
  private String fromAddress;
  private String state;
  private String suffixType;
  private String toAddress;
  private String suffixQualifier;
  private String preQualifier;

  public AddressComponents() {
  }

  // Getters and Setters for AddressComponents
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public String getPreType() {
    return preType;
  }

  public void setPreType(String preType) {
    this.preType = preType;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPreDirection() {
    return preDirection;
  }

  public void setPreDirection(String preDirection) {
    this.preDirection = preDirection;
  }

  public String getSuffixDirection() {
    return suffixDirection;
  }

  public void setSuffixDirection(String suffixDirection) {
    this.suffixDirection = suffixDirection;
  }

  public String getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getSuffixType() {
    return suffixType;
  }

  public void setSuffixType(String suffixType) {
    this.suffixType = suffixType;
  }

  public String getToAddress() {
    return toAddress;
  }

  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }

  public String getSuffixQualifier() {
    return suffixQualifier;
  }

  public void setSuffixQualifier(String suffixQualifier) {
    this.suffixQualifier = suffixQualifier;
  }

  public String getPreQualifier() {
    return preQualifier;
  }

  public void setPreQualifier(String preQualifier) {
    this.preQualifier = preQualifier;
  }
}