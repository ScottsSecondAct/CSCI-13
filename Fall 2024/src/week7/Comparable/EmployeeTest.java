package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Define a class Employee that implements Comparable<Employee>
class Employee implements Comparable<Employee> {
  private String name;
  private int id;
  private double salary;

  public Employee(String name, int id, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }

  // Getter methods for name, id, and salary
  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public double getSalary() {
    return salary;
  }

  // Implement the compareTo method to compare by salary
  @Override
  public int compareTo(Employee other) {
    // Compare by salary in ascending order
    if (this.salary < other.salary) {
      return -1;
    } else if (this.salary > other.salary) {
      return 1;
    } else {
      // If salaries are equal, compare by name (lexicographically)
      return this.name.compareTo(other.name);
    }
  }

  // Override toString for easy printing
  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", id=" + id +
        ", salary=" + salary +
        '}';
  }
}

public class EmployeeTest {
  public static void main(String[] args) {
    // Create a list of Employee objects
    List<Employee> employees = new ArrayList<>();

    employees.add(new Employee("John", 101, 55000));
    employees.add(new Employee("Alice", 102, 62000));
    employees.add(new Employee("Bob", 103, 62000));
    employees.add(new Employee("Clara", 104, 48000));
    employees.add(new Employee("David", 105, 73000));

    // Print the list before sorting
    System.out.println("Before sorting:");
    for (Employee employee : employees) {
      System.out.println(employee);
    }

    // Sort the employees list using Collections.sort
    Collections.sort(employees);

    // Print the list after sorting
    System.out.println("\nAfter sorting by salary (then by name if salaries are equal):");
    for (Employee employee : employees) {
      System.out.println(employee);
    }
  }
}
