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
