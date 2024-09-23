import java.util.Arrays;
import java.awt.Color;

public class InitializingAnArray {
  /*
   * This program demonstrates initializing an array.
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {
    // Tedious way to initialize an array
    int[] integers1 = new int[5]; // Array of integers with a length of 5
    integers1[0] = 1;
    integers1[1] = 2;
    integers1[2] = 3;
    integers1[3] = 4;
    integers1[4] = 5;

    // Access the array and print the values
    System.out.println(Arrays.toString(integers1));
    System.out.println();

    // Easier way to initialize an array
    int[] integers2 = new int[] { 1, 2, 3, 4, 5 }; // Array of integers with a length of 5
    System.out.println(Arrays.toString(integers2));
    System.out.println();

    // Even easier way to initialize an array
    int[] integers3 = { 1, 2, 3, 4, 5 }; // Array of integers with a length of 5
    System.out.println(Arrays.toString(integers3));
    System.out.println();

    // Initializing arrays of different types
    double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10 }; // Array of doubles with a length of 10
    System.out.println(Arrays.toString(doubles));
    System.out.println();

    boolean[] booleans = { true, false, true, false }; // Array of booleans with a length of 4
    System.out.println(Arrays.toString(booleans));
    System.out.println();

    char[] chars = { 'H', 'e', 'l', 'l', 'o', ',', ' ', 'J', 'a', 'v', 'a', ' ', 'W', 'o', 'r', 'l', 'd' };
    System.out.println(Arrays.toString(chars));
    System.out.println();

    String[] strings = { "Hello", "Java", "World" }; // Array of strings with a length of 3
    System.out.println(Arrays.toString(strings));
    System.out.println();

    Color[] colors1 = { Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN, Color.ORANGE };
    System.out.println(Arrays.toString(colors1));
    System.out.println();

    Color[] colors2 = { new Color(237, 209, 176), new Color(255, 182, 193) };
    System.out.println(Arrays.toString(colors2));
    System.out.println();
  }
}
