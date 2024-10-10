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
 
package FunWithArrays;
public class ArraysAsParameters {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5 };

    printArray(numbers);

    System.out.println("\nThe array after doubling returning int[]:");
    int[] doubledArray = doubleArrayWithReturn(numbers);
    for (int i = 0; i < doubledArray.length; i++) {
      System.out.print(doubledArray[i] + " ");
    }
    System.out.println();

    printArray(numbers);

    System.out.println("\nThe array after doubling returning void:");
    doubleArray(numbers);
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();

    printArray(numbers);
  }

  public static int[] doubleArrayWithReturn(int[] array) {
    int newArray[] = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i] * 2;
    }
    return newArray;
  }

  public static void doubleArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] *= 2;
    }
  }

  public static void printArray(int[] array) {
    System.out.println("\nnumbers:");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
