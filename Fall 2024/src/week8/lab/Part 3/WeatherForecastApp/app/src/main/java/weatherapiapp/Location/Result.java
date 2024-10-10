package weatherapiapp.Location;

import java.util.List;

public class Result {
  private Input input;
  private List<AddressMatch> addressMatches;

  public Result() {
  }

  // Getters and Setters for Result
  public Input getInput() {
    return input;
  }

  public void setInput(Input input) {
    this.input = input;
  }

  public List<AddressMatch> getAddressMatches() {
    return addressMatches;
  }

  public void setAddressMatches(List<AddressMatch> addressMatches) {
    this.addressMatches = addressMatches;
  }
}
