public class AccessingAnArray {
  /*
   * This program demonstrates accessing an array and handling exceptions.
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {

    // Declare the array and assign ascending values to it
    int[] integers = new int[5];
    for (int i = 0; i < integers.length; i++) {
      integers[i] = i;
    }

    // Access the array and print the values
    for (int i = 0; i < integers.length; i++) {
      System.out.println("integers[" + i + "] is " + integers[i]);
    }

    try {
      // Access an index that is out of bounds
      System.out.println("integers[integers.length] is " + integers[integers.length]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception caught: " + e);
    }

    System.out.println("Integers[integers.length - 1] is " + integers[integers.length - 1]);

    try {
      // Access an index that is out of bounds
      System.out.println("integers[5] is " + integers[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception caught: " + e);
    }

    try {
      // Access a negative index
      System.out.println("integers[-1] is " + integers[-1]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception caught: " + e);
    }

    try {
      // Access an index that is out of bounds because the Condition part of the for loop is incorrect.
      for (int i = 0; i <= integers.length; i++) {
        System.out.println("integers[" + i + "] is " + integers[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception caught: " + e);
    }
  }
}
