package abstract_classes;

public abstract class Shape {
  // Abstract methods
  public abstract double calculateArea();

  public abstract double calculatePerimeter();

  // Non-abstract method
  public void displayShapeType() {
    System.out.println("This is a shape.");
  }
}
