package week5.inheritance;

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