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
 
import java.util.InputMismatchException;
import java.util.Scanner;

public class DavisCaesarCipher {

  /*
   * Main method to test the Caesar cipher algorithm.
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("**********************************************************");
    System.out.println(" Julius Caesar needs to send messages to the Roman troops.");
    System.out.println(" He uses a simple cipher to encrypt his messages.");
    System.out.println(" The future of Rome depends on the security of the cipher!");
    System.out.println("**********************************************************");

    System.out.print("\nEnter text: ");
    String text = scanner.nextLine();

    int shift;
    while (true) {
      System.out.print("Enter an integer shift value (rotation) between 1 and 25: ");

      try {
        shift = scanner.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("The shift value must be an integer between 1 and 25!");
        scanner.nextLine();
        continue;
      }

      if (shift < 1 || shift > 25) {
        System.out.println("The shift value must be an integer between 1 and 25!");
      } else {
        break;
      }
    }

    String encryptedText = encrypt(text, shift);
    System.out.print("\nEncrypted Text: " + encryptedText);

    String decryptedText = decrypt(encryptedText, shift);
    System.out.print("\nDecrypted Text: " + decryptedText);
    System.out.println();

    scanner.close();
  }

  /*
   * Encrypts the given text using the Caesar cipher algorithm by shifting the
   * characters by the specified shift value.
   *
   * @param text the text to be encrypted
   */
  public static String encrypt(String text, int shift) {
    char[] result = new char[text.length()];

    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      if (Character.isUpperCase(ch)) {
        result[i] = (char) (((ch - 'A' + shift) % 26) + 'A');
      } else if (Character.isLowerCase(ch)) {
        result[i] = (char) (((ch - 'a' + shift) % 26) + 'a');
      } else {
        result[i] = ch;
      }
    }

    return new String(result);
  }

  /*
   * Decrypts the given text using the Caesar cipher algorithm by shifting the
   * characters by the specified shift value.
   *
   * @param text the text to be decrypted
   */
  public static String decrypt(String text, int shift) {
    return encrypt(text, 26 - shift);
  }
}
