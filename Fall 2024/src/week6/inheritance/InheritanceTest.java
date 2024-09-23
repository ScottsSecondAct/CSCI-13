package inheritance;

public class InheritanceTest {
  public static void main(String[] args) {
    Car car = new Car();
    car.start(); // Inherited from Vehicle
    car.honk(); // Defined in Car

    Dog dog = new Dog();
    dog.eat(); // Inherited from Animal
    dog.walk(); // Inherited from Mammal
    dog.bark(); // Defined in Dog

    Circle circle = new Circle(5.0);
    System.out.println("Circle Area: " + circle.calculateArea()); // Output: Circle Area: 78.5398...
    System.out.println("Circle Perimeter: " + circle.calculatePerimeter()); // Output: Circle Perimeter: 31.4159...

    Rectangle rectangle = new Rectangle(4.0, 7.0);
    System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Output: Rectangle Area: 28.0
    System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter()); // Output: Rectangle Perimeter: 22.0
  }
}
