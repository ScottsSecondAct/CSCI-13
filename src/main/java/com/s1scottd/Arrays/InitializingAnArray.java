import color.Color;
import utils.ArrayUtils;

public class InitializingAnArray {
  public static void main(String[] args) {
    // Tedious way to initialize an array
    int[] integers1 = new int[5]; // Array of integers with a length of 5
    integers1[0] = 1;
    integers1[1] = 2;
    integers1[2] = 3;
    integers1[3] = 4;
    integers1[4] = 5;

    // Access the array and print the values
    ArrayUtils.printArray(integers1, "integers1");
    System.out.println();

    // Easier way to initialize an array
    int[] integers2 = new int[] { 1, 2, 3, 4, 5 }; // Array of integers with a length of 5
    ArrayUtils.printArray(integers2, "integers2");
    System.out.println();

    // Even easier way to initialize an array
    int[] integers3 = { 1, 2, 3, 4, 5 }; // Array of integers with a length of 5
    ArrayUtils.printArray(integers3, "integers3");
    System.out.println();

    // Initializing arrays of different types
    double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10 }; // Array of doubles with a length of 10
    ArrayUtils.printArray(doubles, "doubles");
    System.out.println();

    boolean[] booleans = { true, false, true, false }; // Array of booleans with a length of 4
    ArrayUtils.printArray(booleans, "booleans");
    System.out.println();

    char[] chars = { 'H', 'e', 'l', 'l', 'o', ',', ' ', 'J', 'a', 'v', 'a', ' ', 'W', 'o', 'r', 'l', 'd' };
    ArrayUtils.printArray(chars, "chars");
    System.out.println();

    String[] strings = { "Hello", "Java", "World" }; // Array of strings with a length of 3
    ArrayUtils.printArray(strings, "strings");
    System.out.println();

    Color[] colors1 = { Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN, Color.ORANGE, Color.PURPLE };
    ArrayUtils.printArray(colors1, "colors1");
    System.out.println();

    Color[] colors2 = { new Color("Peach", 237, 209, 176), new Color("Light Pink", 255, 182, 193) };
    ArrayUtils.printArray(colors2, "colors2");
    System.out.println();
  }
}
