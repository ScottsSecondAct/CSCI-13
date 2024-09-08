import java.awt.Color;

public class ConstructingAndTraversingAnArray {
  /*
   * This program demonstrates constructing and traversing an array.
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {
    // Declaring arrays
    int[] integers = new int[5]; // Array of integers with a length of 5
    double[] doubles = new double[10]; // Array of doubles with a length of 10
    boolean[] booleans = new boolean[4]; // Array of booleans with a length of 4
    char[] chars = new char[17]; // Array of characters with a length of 20
    String[] strings = new String[3]; // Array of strings with a length of 3
    Color[] colors = new Color[7]; // Array of colors with a length of 6

    // Assigning values to the integers array
    integers[0] = 1;
    integers[1] = 2;
    integers[2] = 3;
    integers[3] = 4;
    integers[4] = 5;

    // Assigning values to the doubles array
    doubles[0] = 1.1;
    doubles[1] = 2.2;
    doubles[2] = 3.3;
    doubles[3] = 4.4;
    doubles[4] = 5.5;
    doubles[5] = 6.6;
    doubles[6] = 7.7;
    doubles[7] = 8.8;
    doubles[8] = 9.9;
    doubles[9] = 10.10;

    // Assigning values to the booleans array
    booleans[0] = true;
    booleans[1] = false;
    booleans[2] = true;
    booleans[3] = false;

    chars[0] = 'H';
    chars[1] = 'e';
    chars[2] = 'l';
    chars[3] = 'l';
    chars[4] = 'o';
    chars[5] = ',';
    chars[6] = ' ';
    chars[7] = 'J';
    chars[8] = 'a';
    chars[9] = 'v';
    chars[10] = 'a';
    chars[11] = ' ';
    chars[12] = 'W';
    chars[13] = 'o';
    chars[14] = 'r';
    chars[15] = 'l';
    chars[16] = 'd';

    // Assigning values to the strings array
    strings[0] = "Hello";
    strings[1] = "Java";
    strings[2] = "World";

    colors[0] = Color.RED;
    colors[1] = Color.BLUE;
    colors[2] = Color.YELLOW;
    colors[3] = Color.GREEN;
    colors[4] = Color.ORANGE;
    colors[5] = new Color(160, 32, 240); // Purple color
    colors[6] = new Color(237, 209, 176); // Peach color

    // Traversing the integers array
    for (int i = 0; i < integers.length; i++) {
      System.out.println("The element at index " + i + " is: " + integers[i]);
    }
    System.out.println();

    // Traversing the doubles array
    for (int i = 0; i < doubles.length; i++) {
      System.out.println("The element at index " + i + " is: " + doubles[i]);
    }
    System.out.println();

    // Traversing the booleans array
    for (int i = 0; i < booleans.length; i++) {
      System.out.println("The element at index " + i + " is: " + booleans[i]);
    }
    System.out.println();

    // Traversing the chars array
    for (int i = 0; i < chars.length; i++) {
      System.out.println("The element at index " + i + " is: " + chars[i]);
    }
    System.out.println();

    // Traversing the strings array
    for (int i = 0; i < strings.length; i++) {
      System.out.println("The element at index " + i + " is: " + strings[i]);
    }
    System.out.println();

    // Traversing the colors array
    for (int i = 0; i < colors.length; i++) {
      System.out.println("The element at index " + i + " is: " + colors[i].toString());
    }
    System.out.println();
  }
}
