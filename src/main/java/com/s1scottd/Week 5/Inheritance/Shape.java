
// Base class Shape (no longer abstract)
class Shape {
// abstract class Shape {
  protected String color;
  protected boolean filled;

  // Constructor for Shape
  public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  // Method to return a string representation of the shape
  public String toString() {
    return "Shape[color=" + color + ", filled=" + filled + "]";
  }

  // Default method for area (can be overridden)
  public double area() {
    return 0;
  }

  // Default method for perimeter (can be overridden)
  public double perimeter() {
    return 0;
  }

  // abstract public double area();
  // abstract public double perimeter();
}

// Circle class extending Shape
class Circle extends Shape {
  private double radius;

  // Constructor for Circle
  public Circle(String color, boolean filled, double radius) {
    super(color, filled);
    this.radius = radius;
  }

  // Method to calculate the area of the circle
  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  // Method to calculate the perimeter of the circle
  @Override
  public double perimeter() {
    return 2 * Math.PI * radius;
  }

  // Method to return a string representation of the circle
  @Override
  public String toString() {
    return "Circle[color=" + color + ", filled=" + filled + ", radius=" + radius + "]";
  }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
  private double width;
  private double height;

  // Constructor for Rectangle
  public Rectangle(String color, boolean filled, double width, double height) {
    super(color, filled);
    this.width = width;
    this.height = height;
  }

  // Method to calculate the area of the rectangle
  @Override
  public double area() {
    return width * height;
  }

  // Method to calculate the perimeter of the rectangle
  @Override
  public double perimeter() {
    return 2 * (width + height);
  }

  // Method to return a string representation of the rectangle
  @Override
  public String toString() {
    return "Rectangle[color=" + color + ", filled=" + filled + ", width=" + width + ", height=" + height + "]";
  }
}

// Triangle class extending Shape
class Triangle extends Shape {
  private double sideA;
  private double sideB;
  private double sideC;

  // Constructor for Triangle
  public Triangle(String color, boolean filled, double sideA, double sideB, double sideC) {
    super(color, filled);
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  // Method to calculate the area of the triangle using Heron's formula
  @Override
  public double area() {
    double s = (sideA + sideB + sideC) / 2; // semi-perimeter
    return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Heron's formula
  }

  // Method to calculate the perimeter of the triangle
  @Override
  public double perimeter() {
    return sideA + sideB + sideC;
  }

  // Method to return a string representation of the triangle
  @Override
  public String toString() {
    return "Triangle[color=" + color + ", filled=" + filled + ", sideA=" + sideA + ", sideB=" + sideB + ", sideC="
        + sideC + "]";
  }
}