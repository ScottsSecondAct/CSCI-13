package main.java.com.s1scottd.Conditionals;
import java.util.Scanner;

public class IfThen {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double discount = 0.0;
    double price = 0.0;

    System.out.println("Enter your age: ");
    int age = scanner.nextInt();

    System.out.println("Enter the time: ");
    double time = scanner.nextDouble();

    if (age <= 12) {
      price = 5.00;
    } else if (age <= 17) {
      price = 7.50;
    } else if (age <= 64) {
      price = 10.00;
    } else if (age >= 65) {
      price = 6.50;
    } else {
    }

    if (time < 17.0) {
      price *= (1.0 - discount);
    }

    System.out.println("The price is: " + price);

    scanner.close();
  }
}
