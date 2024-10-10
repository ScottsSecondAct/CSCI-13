/**
 * MIT License
 *
 * Copyright (c) 2024 Scott Davis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
 
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
