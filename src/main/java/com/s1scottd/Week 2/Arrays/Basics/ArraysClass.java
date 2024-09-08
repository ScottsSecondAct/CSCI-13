import java.util.Arrays;

import utils.ArrayUtils;

public class ArraysClass {
  /*
   * This program demonstrates using the Arrays class to work with arrays.
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {
    // Initialize an array with some elements
    int[] numbers1 = { 10, 20, 30, 40, 50 };
    int[] numbers2 = { 10, 20, 30, 40, 50 };
    int[] numbers3 = { 10, 20, 3, 40, 50 };

    // Print the arrays
    ArrayUtils.printArray(numbers1, "numbers1");
    System.out.println();
    ArrayUtils.printArray(numbers2, "numbers2");
    System.out.println();
    ArrayUtils.printArray(numbers3, "numbers3");
    System.out.println();

    // Search for an element in the array
    int indexOfThirty = Arrays.binarySearch(numbers1, 30); // Output: 2
    System.out.println("Index of 30 in numbers1: " + indexOfThirty);
    System.out.println();

    // Sort the array in ascending order
    System.out.println("numbers3 before sorting:");
    ArrayUtils.printArray(numbers3);
    Arrays.sort(numbers3);
    System.out.println("numbers3 after sorting:");
    ArrayUtils.printArray(numbers3);
    System.out.println();

    // Compare two arrays
    boolean areEqual = Arrays.equals(numbers1, numbers2); // Output: true
    System.out.println("numbers1 and numbers2 are equal: " + areEqual);
    System.out.println();

    // Fill an array with a specific value
    int fillValue = -1;
    System.out.println("Create new array with a length of 5 and fill it with: " + fillValue);
    int[] numbers4 = new int[5];
    Arrays.fill(numbers4, fillValue);
    ArrayUtils.printArray(numbers4, "numbers4");

    // Copy an array
    System.out.println("Copy an array:");
    int[] numbers5 = Arrays.copyOf(numbers1, numbers1.length);
    System.out.println("Copy numbers1 into a new array named numbers5:");
    ArrayUtils.printArray(numbers5);

    // Copy a range of an array
    System.out.println("Copy a range of an array:");
    int[] numbers6 = Arrays.copyOfRange(numbers1, 1, 4);
    System.out.println("Copy numbers1 from index 1 to 4 into a new array named numbers6:");
    ArrayUtils.printArray(numbers6);
  }
}
