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
