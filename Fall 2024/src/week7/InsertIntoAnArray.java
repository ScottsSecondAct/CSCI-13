import java.util.Arrays;

public class InsertIntoAnArray {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 }; // Initial array of size 5
    int valueToInsert = 99;
    int indexToInsert = 2;

    // Resize the array if necessary and insert the value
    nums = insertIntoArray(nums, valueToInsert, indexToInsert);

    // Print the updated array
    System.out.println("Updated array: " + Arrays.toString(nums));
  }

  // Method to insert into an array with automatic resizing if needed
  public static int[] insertIntoArray(int[] oldArray, int value, int index) {
    // If the array is full, resize it by doubling its size
    if (oldArray.length == index) {
      oldArray = resizeArray(oldArray);
    }

    // Create a new array with space for the new element
    int[] newArray = new int[oldArray.length + 1];

    // Step 1: Copy elements up to the insertion index
    for (int i = 0; i < index; i++) {
      newArray[i] = oldArray[i];
    }

    // Step 2: Insert the new value at the specified index
    newArray[index] = value;

    // Step 3: Copy the remaining elements after the insertion point
    for (int i = index; i < oldArray.length; i++) {
      newArray[i + 1] = oldArray[i];
    }

    return newArray; // Return the new array with the inserted element
  }

  // Method to resize the array by doubling its size
  public static int[] resizeArray(int[] oldArray) {
    int newSize = oldArray.length * 2; // Double the size
    int[] newArray = new int[newSize];

    // Copy elements from the old array to the new one
    for (int i = 0; i < oldArray.length; i++) {
      newArray[i] = oldArray[i];
    }

    return newArray; // Return the new resized array
  }
}
