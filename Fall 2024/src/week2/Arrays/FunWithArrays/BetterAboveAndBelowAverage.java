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

public class BetterAboveAndBelowAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of students: ");
    int numberOfStudents = scanner.nextInt();
    int grades[] = new int[numberOfStudents];

    int numberOfStudentsBelowAverage = 0;
    int numberOfStudentsAboveAverage = 0;

    int sum = 0;
    for (int i = 0; i < numberOfStudents; i++) {
      System.out.println("Enter the grade for student " + (i + 1) + ": ");
      grades[i] = scanner.nextInt();
      sum += grades[i];
    }

    double average = sum / (double) numberOfStudents;

    for (int i = 0; i < grades.length; i++) {
      if (grades[i] < average) {
        numberOfStudentsBelowAverage++;
      } else if (grades[i] > average) {
        numberOfStudentsAboveAverage++;
      }
    }

    System.out.println("The average of the three grades is: " + average);
    System.out.println("The number of students who scored below average is: " + numberOfStudentsBelowAverage);
    System.out.println("The number of students who scored above average is: " + numberOfStudentsAboveAverage);

    scanner.close();
  }
}
