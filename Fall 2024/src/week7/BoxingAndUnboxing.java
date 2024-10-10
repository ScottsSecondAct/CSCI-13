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
 


public class BoxingAndUnboxing {
  public static void main(String[] args) {

    // Autoboxing and Unboxing
    int num = 10;
    Integer wrappedNum = num; // Auto-Boxing

    // Unboxing: Converting a wrapper class to a primitive type
    int unwrappedNum = wrappedNum; // Auto-Unboxing

    System.out.println("Original number: " + num);
    System.out.println("Auto Wrapped number: " + wrappedNum);
    System.out.println("Auto Unwrapped number: " + unwrappedNum);

    // Manual Boxing and Unboxing
    Integer manualWrappedNum = Integer.valueOf(num); // Manual-boxing
    int manualUnwrappedNum = manualWrappedNum.intValue(); // Manual-unboxing

    System.out.println("Original number: " + num);
    System.out.println("Manually wrapped number: " + manualWrappedNum);
    System.out.println("Manually unwrapped number: " + manualUnwrappedNum);
  }
}