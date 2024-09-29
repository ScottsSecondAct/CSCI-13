import java.util.Arrays;

public class DeleteFromAnArray {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 }; // Initial array
    int indexToDelete = 2; // The index of the element to delete (deleting 3)

    // Delete the value from the array
    nums = deleteFromArray(nums, indexToDelete);

    // Print the updated array
    System.out.println("Updated array: " + Arrays.toString(nums));
  }

  // Method to delete an element from an array
  public static int[] deleteFromArray(int[] oldArray, int index) {

    // Step 1: Create a new array that is one element smaller
    int[] newArray = new int[oldArray.length - 1];

    // Step 2: Copy elements before the index to delete
    for (int i = 0; i < index; i++) {
      newArray[i] = oldArray[i];
    }

    // Step 3: Copy elements after the index to delete (shifting elements left)
    for (int i = index; i < oldArray.length - 1; i++) {
      newArray[i] = oldArray[i + 1];
    }

    return newArray; // Return the new array with the element deleted
  }
}
