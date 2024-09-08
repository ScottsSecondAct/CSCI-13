import java.util.Scanner;

public class Looping {
  /*
   * This program demonstrates looping through an array.
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {
    int[] integers = { 1, 2, 3, 4, 5 };

    Scanner scanner = new Scanner(System.in);
    int type = 5;
    do {
      System.out.println("Enter a number between 1 and 5");
      type = scanner.nextInt();
      switch (type) {
        case 1: // Numbers 1 to 10 using for loop
          for (int i = 1; i <= 10; i++) {
            System.out.println("i is " + i);
          }
          break;
        case 2: // Even Numbers 20 to 1 using while loop
          int num = 20;
          while (num > 0) {
            if (num % 2 == 0) {
              System.out.println("num is " + num);
            }
            num--;
          }
          break;
        case 3: // Numbers 10 to 1 using do while loop
          num = 10;
          do {
            System.out.println("num is " + num);
            num--;
          } while(num > 0);
          break;
        case 4: // Sum of numbers in the array
          int sum = 0;
          for (int i : integers) {
            sum += i;
          }
          System.out.println("Sum is " + sum);
          break;
        case 5:
          break;
        default:
          break;
      }

    } while (type != 5);

    scanner.close();
  }
}
