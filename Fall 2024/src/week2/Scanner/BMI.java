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
 
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

class BMI {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double weight = getWeight();
    double height = getHeight();

    double bmi = 700 * weight / Math.pow(height, 2);
    System.out.println("BMI: " + bmi);
    scanner.close();
  }

  /*
   * This method gets the weight from the user and returns it.
   *
   * @return the weight of the user
   */
  public static double getWeight() {
    double weight = 0;
    while (true) {
      System.out.print("Enter your weight in pounds: ");
      try {
        weight = scanner.nextDouble();
        if (weight <= 0) {
          System.out.println("The weight must be greater than 0!");
          continue;
        }
        break;
      } catch (InputMismatchException e) {
        System.out.println("The weight must be a decimal number!");
        scanner.nextLine(); // empty the buffer
        continue;
      }
    }
    return weight;
  }

  /*
   * This method gets the height from the user and returns it.
   *
   * @return the height of the user
   */
  public static double getHeight() {
    double height = 0;
    while (true) {
      System.out.print("Enter your height in pounds: ");
      try {
        height = scanner.nextDouble();
        if (height <= 0) {
          System.out.println("The height must be greater than 0!");
          continue;
        }
        break;
      } catch (InputMismatchException e) {
        System.out.println("The height must be a decimal number!");
        scanner.nextLine(); // empty the buffer
        continue;
      }
    }
    return height;
  }
}