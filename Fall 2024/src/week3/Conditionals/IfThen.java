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

public class IfThen {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double discount = 0.0;
    double price = 0.0;

    System.out.println("Enter your age: ");
    int age = scanner.nextInt();

    System.out.println("Enter the time: ");
    double time = scanner.nextDouble();

    if (age <= 12) {
      price = 5.00;
    } else if (age <= 17) {
      price = 7.50;
    } else if (age <= 64) {
      price = 10.00;
    } else if (age >= 65) {
      price = 6.50;
    } else {
    }

    if (time < 17.0) {
      price *= (1.0 - discount);
    }

    System.out.println("The price is: " + price);

    scanner.close();
  }
}
