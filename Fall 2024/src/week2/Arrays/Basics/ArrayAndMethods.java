import java.util.Arrays;

public class ArrayAndMethods {
  /*
   * This program demonstrates using methods with arrays.
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {
    // Creating an array of integers
    int[] numbers = { 5, 12, 3, 19, 6, 1, 8 };

    // Print the array elements
    System.out.println("Original array:");
    System.out.println(Arrays.toString(numbers));
    System.out.println();

    // Find and print the maximum value in the array
    int max = findMax(numbers);
    System.out.println("Maximum value in the array: " + max);
    System.out.println();

    // Return a sorted array, without modifying the argument, in ascending order
    int[] sortedArray = createSortedArray(numbers);
    System.out.println("Sort copy of array and return sorted copy:");
    System.out.println(Arrays.toString(sortedArray));
    System.out.println();
    System.out.println("Original array:");
    System.out.println(Arrays.toString(numbers));
    System.out.println();

    // Sort the array in ascending order
    sortArray(numbers);
    System.out.println("Sorted array:");
    System.out.println(Arrays.toString(numbers));
    System.out.println();
    System.out.println("Original array:");
    System.out.println(Arrays.toString(numbers));
    System.out.println();

    // Find and print the average of the array elements
    double average = findAverage(numbers);
    System.out.println("Average of the array: " + average);
    System.out.println();
  }

  // Method to find the maximum value in an array
  public static int findMax(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  // Method to sort the array in ascending order
  public static void sortArray(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          // Swap array[i] and array[j]
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }

  // Method to create a sorted copy of the array in ascending order
  public static int[] createSortedArray(int[] array) {
    int[] sortedArray = Arrays.copyOf(array, array.length);
    for (int i = 0; i < sortedArray.length - 1; i++) {
      for (int j = i + 1; j < sortedArray.length; j++) {
        if (sortedArray[i] > sortedArray[j]) {
          // Swap array[i] and array[j]
          int temp = sortedArray[i];
          sortedArray[i] = sortedArray[j];
          sortedArray[j] = temp;
        }
      }
    }
    return sortedArray;
  }

  // Method to calculate the average of the array elements
  public static double findAverage(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return (double) sum / array.length;
  }
}
