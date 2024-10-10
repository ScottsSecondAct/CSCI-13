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
 
import java.util.Scanner;

public class Looping {
  /*
   * This program demonstrates looping through an array.
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {
    int[] integers = { 1, 2, 3, 4, 5 };

    Scanner scanner = new Scanner(System.in);
    int type = 5;
    do {
      System.out.println("Enter a number between 1 and 5");
      type = scanner.nextInt();
      switch (type) {
        case 1: // Numbers 1 to 10 using for loop
          for (int i = 1; i <= 10; i++) {
            System.out.println("i is " + i);
          }
          break;
        case 2: // Even Numbers 20 to 1 using while loop
          int num = 20;
          while (num > 0) {
            if (num % 2 == 0) {
              System.out.println("num is " + num);
            }
            num--;
          }
          break;
        case 3: // Numbers 10 to 1 using do while loop
          num = 10;
          do {
            System.out.println("num is " + num);
            num--;
          } while(num > 0);
          break;
        case 4: // Sum of numbers in the array
          int sum = 0;
          for (int i : integers) {
            sum += i;
          }
          System.out.println("Sum is " + sum);
          break;
        case 5:
          break;
        default:
          break;
      }

    } while (type != 5);

    scanner.close();
  }
}
