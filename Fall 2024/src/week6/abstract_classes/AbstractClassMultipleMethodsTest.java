package abstract_classes;

public class AbstractClassMultipleMethodsTest {
  public static void main(String[] args) {
    Shape circle = new Circle(5.0);
    System.out.println("Circle Area: " + circle.calculateArea()); // Output: Circle Area: 78.5398...
    System.out.println("Circle Perimeter: " + circle.calculatePerimeter()); // Output: Circle Perimeter: 31.4159...

    Shape rectangle = new Rectangle(4.0, 7.0);
    System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Output: Rectangle Area: 28.0
    System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter()); // Output: Rectangle Perimeter: 22.0
  }
}