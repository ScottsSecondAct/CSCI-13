package interfaces_and_multiple_inheritance;

public class Duck implements CanSwim, CanFly {
  @Override
  public void swim() {
    System.out.println("Duck is swimming.");
  }

  @Override
  public void fly() {
    System.out.println("Duck is flying.");
  }
}
