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
 
package main.java.com.s1scottd.Conditionals;
import java.util.Scanner;

public class SwitchCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double result = 0.0;

    printMenu();

    int operation = scanner.nextInt();

    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();

    switch (operation) {
      case 1:
        result = num1 + num2;
        break;
      case 2:
        result = num1 - num2;
        break;
      case 3:
        result = num1 * num2;
        break;
      case 4:
        result = num1 / num2;
        break;
      default:
        break;
    }
    System.out.println(result);
    scanner.close();
  }

  public static void printMenu() {
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Multiply");
    System.out.println("4. Divide");
    System.out.println("Enter the operation: ");
  }
}
