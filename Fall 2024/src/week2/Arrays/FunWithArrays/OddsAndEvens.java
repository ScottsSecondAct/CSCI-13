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
public class OddsAndEvens {
  public static void main(String[] args) {
    int[] odds = new int[10];
    int[] evens = new int[10];
    int oddIndex = 0; int evenIndex = 0;
    for (int i = 0; i < 20; i++) {
      if (i % 2 == 0) {
        evens[evenIndex++] = i;
        //evenIndex++;
      } else {
        odds[oddIndex++] = i;
        //oddIndex++;
      }
    }

    System.out.print("Evens: ");
    for (int i = 0; i < evens.length; i++) {
      System.out.print(evens[i] + " ");
    }
    System.out.println();

    System.out.print("Odds: ");
    for (int i = 0; i < odds.length; i++) {
      System.out.print(odds[i] + " ");
    }
  }
}