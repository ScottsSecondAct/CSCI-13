import java.util.Scanner;

/*
 * This program reads numbers separated by commas and spaces.
 * 
 * Example input: 1, 2, 3
 * 
 *  Regular Expression (RegEx): 
 *    \\s*: zero or more spaces
 *    ,: a comma
 *    \\s*: zero or more spaces
 * 
 *    Examples:
 *      "1,2,3": Matches directly with no spaces.
 *      "1, 2, 3": Matches with single spaces after each comma.
 *      "1 ,2 , 3": Matches with varying spaces around commas.
 *      "1 , 2 , 3 ": Matches even with a trailing space after the last number.
 */
public class Delimiters {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter numbers separated by commas and spaces (e.g., 1, 2, 3): ");
    String numbers = scanner.nextLine(); // Read the entire line

    Scanner numberScanner = new Scanner(numbers); // Create a new scanner to read the numbers
    numberScanner.useDelimiter("\\s*,\\s*"); // Use a regex to handle commas with optional spaces
    while (numberScanner.hasNextInt()) {
      int num = numberScanner.nextInt();
      System.out.println("You entered: " + num);
    }
    numberScanner.close(); // Close the nested scanner
    scanner.close();
  }
}
