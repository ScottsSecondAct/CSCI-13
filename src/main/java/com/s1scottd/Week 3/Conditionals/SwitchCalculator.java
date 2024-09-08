package main.java.com.s1scottd.Conditionals;
import java.util.Scanner;

public class SwitchCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double result = 0.0;

    printMenu();

    int operation = scanner.nextInt();

    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();

    switch (operation) {
      case 1:
        result = num1 + num2;
        break;
      case 2:
        result = num1 - num2;
        break;
      case 3:
        result = num1 * num2;
        break;
      case 4:
        result = num1 / num2;
        break;
      default:
        break;
    }
    System.out.println(result);
    scanner.close();
  }

  public static void printMenu() {
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Multiply");
    System.out.println("4. Divide");
    System.out.println("Enter the operation: ");
  }
}
