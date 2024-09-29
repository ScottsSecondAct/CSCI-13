
import java.util.Scanner;
import java.util.Arrays;

public class ResizeArray {
  public static void main(String[] args) {
    int index = 0;
    int num = 0;
    int[] nums = new int[10]; // Initial array of size 10
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("Input a positive integer:");
      num = scanner.nextInt();

      if (index >= nums.length) {
        nums = resizeArray(nums); // Resize array if the limit is reached
      }

      nums[index++] = num;
    } while (num > 0);

    System.out.println("You entered: " + Arrays.toString(Arrays.copyOf(nums, index - 1)));
  
    scanner.close();
  }

  // Method to resize the array when it's full
  public static int[] resizeArray(int[] oldArray) {
    int newSize = oldArray.length * 2; // Double the size
    int[] newArray = new int[newSize];

    // Copy elements from old array to new array
    for (int i = 0; i < oldArray.length; i++) {
      newArray[i] = oldArray[i];
    }

    return newArray; // Return the new resized array
  }
}
