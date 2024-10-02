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
