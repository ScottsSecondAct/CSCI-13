package weatherapiapp.Location;

public class Input {
  private Address address;
  private Benchmark benchmark;

  public Input() {
  }

  // Getters and Setters for Input
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Benchmark getBenchmark() {
    return benchmark;
  }

  public void setBenchmark(Benchmark benchmark) {
    this.benchmark = benchmark;
  }
}

