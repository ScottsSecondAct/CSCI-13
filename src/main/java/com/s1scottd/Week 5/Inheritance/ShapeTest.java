package Inheritance;
public class ShapeTest {
  public static void main(String[] args) {
    Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(4, 6);

    System.out.println("Circle Area: " + circle.area()); // Output: Circle Area: 78.53981633974483
    System.out.println("Circle Perimeter: " + circle.perimeter()); // Output: Circle Perimeter: 31.41592653589793

    System.out.println("Rectangle Area: " + rectangle.area()); // Output: Rectangle Area: 24.0
    System.out.println("Rectangle Perimeter: " + rectangle.perimeter()); // Output: Rectangle Perimeter: 20.0
  }
}
