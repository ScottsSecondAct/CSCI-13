import java.util.*;

public class InsertIntoAnArrayList {

  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    int valueToInsert = 99;
    int indexToInsert = 2;

    // Insert the value
    nums.add(indexToInsert, valueToInsert);

    // Print the updated array
    System.out.println("Updated array: " + nums);
  }
}