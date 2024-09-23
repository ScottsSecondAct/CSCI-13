package instance_of;

public class InstanceOfTest  {
  public static void main(String[] args) {
    Vehicle v = new Motorcycle();

    if (v instanceof Motorcycle) {
      Motorcycle m = (Motorcycle) v;
      m.revEngine(); // Safe to cast because we checked with instanceof
    }
  }
}