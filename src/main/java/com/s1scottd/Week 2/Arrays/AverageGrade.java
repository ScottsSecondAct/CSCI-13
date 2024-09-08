import java.util.Scanner;

public class AverageGrade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;

    System.out.println("Enter the first grade: ");
    sum = scanner.nextInt();
    System.out.println("Enter the second grade: ");
    sum += scanner.nextInt();
    System.out.println("Enter the third grade: ");
    sum += scanner.nextInt();
    double average = sum / 3.0;
    System.out.println("The average of the three grades is: " + average);

    scanner.close();
  }
}