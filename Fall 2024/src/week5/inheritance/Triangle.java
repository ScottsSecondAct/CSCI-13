/**
 * MIT License
 *
 * Copyright (c) 2024 Scott Davis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
 
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