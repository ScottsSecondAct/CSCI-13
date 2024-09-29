package Package1;

public class SuperClass {
  protected int value;

  public SuperClass(int value) {
    this.value = value;
  }

  public void printValue() {
    System.out.println("Value in SuperClass: " + value);
  }
}