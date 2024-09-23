package has_a_relationship;
public class Car {
  private Engine engine;

  public Car() {
    engine = new Engine();
  }

  public void startCar() {
    engine.start(); // Has-a relationship
    System.out.println("Car is ready to drive.");
  }
}
