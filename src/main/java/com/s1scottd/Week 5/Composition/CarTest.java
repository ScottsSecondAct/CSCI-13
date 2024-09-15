package Composition;
public class CarTest {
  public static void main(String[] args) {
    Engine engine = new Engine();
    Transmission transmission = new Transmission();
    Car car = new Car(engine, transmission);

    car.start(); // Output: Engine is starting...
    car.drive(); // Output: Car is moving... \n Shifting gears...
    car.stop(); // Output: Engine is stopping...
  }
}