package inheritance;

public class Shape {
  // Abstract methods
  public double calculateArea() {
    return 0.0;
  }

  public double calculatePerimeter() {
    return 0.0;
  }

  // Non-abstract method
  public void displayShapeType() {
    System.out.println("This is a shape.");
  }
}
