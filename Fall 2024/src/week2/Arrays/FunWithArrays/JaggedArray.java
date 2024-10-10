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
public class JaggedArray {
  /*
   * The code below creates a jagged array of integers. The array is 5 elements
   * long, but each element is an array of integers of varying length. The
   * lengths of the arrays are 1, 2, 3, 4, and 5. The elements of the arrays are
   * the sum of the indices of the element and the index of the inner array.
   */
  public static void main(String[] args) {
    int[][] jagged = new int[5][];

    for (int i = 0; i < jagged.length; i++) {
      jagged[i] = new int[i + 1];
      for (int j = 0; j < jagged[i].length; j++) {
        jagged[i][j] = i + j;
      }
    }

    for (int i = 0; i < jagged.length; i++) {
      for (int j = 0; j < jagged[i].length; j++) {
        System.out.print(jagged[i][j] + " ");
      }
      System.out.println();
    }
  }
}
