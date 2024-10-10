/**
 * MIT License
 *
 * Copyright (c) 2024 Scott Davis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
 
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
