package week5.inheritance;

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