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
 
package classroom_exercises;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
  private String name;
  private double gpa;

  public Student(String name, double gpa) {
    this.name = name;
    this.gpa = gpa;
  }

  public String getName() {
    return name;
  }

  public double getGpa() {
    return gpa;
  }

  @Override
  public int compareTo(Student other) {
    // Compare GPA in descending order
    if (this.gpa < other.gpa) {
      return 1;
    } else if (this.gpa > other.gpa) {
      return -1;
    } else {
      return 0;
    }
  }

  @Override
  public String toString() {
    return name + ": " + gpa;
  }
}

public class StudentManager {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();

    // Add some students to the ArrayList
    students.add(new Student("Alice", 3.5));
    students.add(new Student("Bob", 3.9));
    students.add(new Student("Charlie", 3.7));
    students.add(new Student("Diana", 3.2));
    students.add(new Student("Evan", 3.8));

    // Sort the students by GPA in descending order
    Collections.sort(students);

    // Print out the sorted list
    for (Student student : students) {
      System.out.println(student);
    }
  }
}
