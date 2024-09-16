// Main class to test all the shapes
public class ShapeTest {
  public static void main(String[] args) {
    // Creating a Circle object
    Circle circle = new Circle("Blue", true, 5);
    System.out.println(circle);
    System.out.println("Circle Area: " + circle.area());
    System.out.println("Circle Perimeter: " + circle.perimeter());

    // Creating a Rectangle object
    Rectangle rectangle = new Rectangle("Green", false, 4, 6);
    System.out.println(rectangle);
    System.out.println("Rectangle Area: " + rectangle.area());
    System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

    // Creating a Triangle object
    Triangle triangle = new Triangle("Red", true, 3, 4, 5);
    System.out.println(triangle);
    System.out.println("Triangle Area: " + triangle.area());
    System.out.println("Triangle Perimeter: " + triangle.perimeter());
  }
}
