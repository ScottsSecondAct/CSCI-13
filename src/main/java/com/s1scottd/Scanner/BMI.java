import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

class BMI {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double weight = getWeight();
    double height = getHeight();

    double bmi = 700 * weight / Math.pow(height, 2);
    System.out.println("BMI: " + bmi);
    scanner.close();
  }

  /*
   * This method gets the weight from the user and returns it.
   *
   * @return the weight of the user
   */
  public static double getWeight() {
    double weight = 0;
    while (true) {
      System.out.print("Enter your weight in pounds: ");
      try {
        weight = scanner.nextDouble();
        if (weight <= 0) {
          System.out.println("The weight must be greater than 0!");
          continue;
        }
        break;
      } catch (InputMismatchException e) {
        System.out.println("The weight must be a decimal number!");
        scanner.nextLine(); // empty the buffer
        continue;
      }
    }
    return weight;
  }

  /*
   * This method gets the height from the user and returns it.
   *
   * @return the height of the user
   */
  public static double getHeight() {
    double height = 0;
    while (true) {
      System.out.print("Enter your height in pounds: ");
      try {
        height = scanner.nextDouble();
        if (height <= 0) {
          System.out.println("The height must be greater than 0!");
          continue;
        }
        break;
      } catch (InputMismatchException e) {
        System.out.println("The height must be a decimal number!");
        scanner.nextLine(); // empty the buffer
        continue;
      }
    }
    return height;
  }
}