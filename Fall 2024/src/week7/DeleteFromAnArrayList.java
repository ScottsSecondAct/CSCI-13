import java.util.*;

public class DeleteFromAnArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    int indexToDelete = 2; // The index of the element to delete (deleting 3)

    // Delete the value from the array
    nums.remove(indexToDelete);

    // Print the updated array
    System.out.println("Updated array: " + nums);
  }
}