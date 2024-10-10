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
 
package FunWithArrays;
import java.util.Scanner;

public class AboveAndBelowAverage {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int numberOfStudentsBelowAverage = 0;
      int numberOfStudentsAverage = 0;

      System.out.println("Enter the first grade: ");
      int grade1 = scanner.nextInt();
      System.out.println("Enter the second grade: ");
      int grade2 = scanner.nextInt();
      System.out.println("Enter the third grade: ");
      int grade3 = scanner.nextInt();
      double average = (grade1 + grade2 + grade3) / 3.0;

      if (grade1 < average) {
        numberOfStudentsBelowAverage++;
      } else if (grade1 == average) {
        numberOfStudentsAverage++;
      }

      if (grade2 < average) {
        numberOfStudentsBelowAverage++;
      } else if (grade2 == average) {
        numberOfStudentsAverage++;
      }

      if (grade3 < average) {
        numberOfStudentsBelowAverage++;
      } else if (grade3 == average) {
        numberOfStudentsAverage++;
      }

      System.out.println("The average of the three grades is: " + average);
      System.out.println("The number of students who scored below average is: " + numberOfStudentsBelowAverage);
      System.out.println("The number of students who scored average is: " + numberOfStudentsAverage);

      scanner.close();
    }
}
