package week5.inheritance;

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

// Triangle class extending Shape
public class Triangle extends Shape {
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