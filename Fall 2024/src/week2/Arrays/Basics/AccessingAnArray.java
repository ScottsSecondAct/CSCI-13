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
