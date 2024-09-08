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
