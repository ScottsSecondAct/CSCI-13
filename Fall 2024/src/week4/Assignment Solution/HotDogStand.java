public class HotDogStand {
  private static double price = 5.00;
  private static double cost = 1.25;
  private int id;
  private String location;
  private int countSold = 0;

  public HotDogStand(int id, String location) {
    this.id = id;
    this.location = location;
  }

  public int getId() {
    return this.id;
  }

  public int getCountSold() {
    return this.countSold;
  }

  public void setAddress(String location) {
    this.location = location;
  }

  public void order(int count) {
    this.countSold += count;
  }

  public double netIncome() {
    return this.countSold * (price - cost);
  }

  @Override
  public String toString() {
    return "ID#:" + id +
        "\nAddress: " + location +
        "\nHotdogs sold: " + countSold +
        "\nNet Income: " + netIncome();
  }
}
