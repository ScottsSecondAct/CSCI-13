package interfaces_and_multiple_inheritance;

public class InterfaceTest {
  public static void main(String[] args) {
    Duck duck = new Duck();
    duck.swim(); // Implements CanSwim
    duck.fly(); // Implements CanFly
  }
}