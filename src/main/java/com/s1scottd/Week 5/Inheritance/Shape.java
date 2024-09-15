package Inheritance;
// Base class for shapes
abstract class Shape {
  abstract double area();

  abstract double perimeter();
}

// Derived class for Circle
class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double area() {
    return Math.PI * radius * radius;
  }

  @Override
  double perimeter() {
    return 2 * Math.PI * radius;
  }
}

// Derived class for Rectangle
class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  double area() {
    return width * height;
  }

  @Override
  double perimeter() {
    return 2 * (width + height);
  }
}

