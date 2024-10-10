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
 
package ArrayList;

import java.util.*;

public class ArrayListExamples {
  public static void main(String[] args) {
    // 1. Create an ArrayList of Strings
    ArrayList<String> fruits = new ArrayList<>();
    System.out.println("Initial ArrayList: " + fruits);
    System.out.println("Size of fruits: " + fruits.size());

    // 2. add(E e) - Adding elements to the ArrayList
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    System.out.println("After adding elements: " + fruits);
    System.out.println("Size of fruits: " + fruits.size());

    // 3. add(int index, E e) - Inserting an element at a specific position
    fruits.add(1, "Mango");
    System.out.println("After adding Mango at index 1: " + fruits);

    // 4. get(int index) - Getting the element at a specific index
    String fruit = fruits.get(2);
    System.out.println("Element at index 2: " + fruit);

    // 5. set(int index, E e) - Replacing an element at a specific index
    fruits.set(2, "Pineapple");
    System.out.println("After setting Pineapple at index 2: " + fruits);
    for (String f : fruits) {
      System.out.println(f);
    }

    // 6. remove(Object o) - Removing an element by value
    fruits.remove("Mango");
    System.out.println("After removing Mango: " + fruits);

    // 7. remove(int index) - Removing an element by index
    fruits.remove(1);
    System.out.println("After removing element at index 1: " + fruits);

    // 8. size() - Checking the size of the ArrayList
    System.out.println("Size of ArrayList: " + fruits.size());

    // 9. contains(Object o) - Checking if an element exists
    boolean hasApple = fruits.contains("Apple");
    System.out.println("Contains Apple? " + hasApple);

    // 10. isEmpty() - Checking if the ArrayList is empty
    boolean isEmpty = fruits.isEmpty();
    System.out.println("Is the ArrayList empty? " + isEmpty);

    // 11. indexOf(Object o) - Finding the index of an element
    int indexOfOrange = fruits.indexOf("kiwi");
    System.out.println("Index of Orange: " + indexOfOrange);

    // 12. lastIndexOf(Object o) - Finding the last index of an element
    fruits.add("Apple");
    int lastIndexOfApple = fruits.lastIndexOf("Apple");
    System.out.println("Last index of Apple: " + lastIndexOfApple);

    // 13. toArray() - Converting the ArrayList to an array
    Object[] fruitArray = fruits.toArray();
    System.out.println("Array: ");
    for (Object f : fruitArray) {
      System.out.println(f);
    }

    // 14. subList(int fromIndex, int toIndex) - Getting a sublist of the ArrayList
    ArrayList<String> subList = new ArrayList<>(fruits.subList(0, 2));
    System.out.println("Sublist from index 0 to 2: " + subList);

    // 15. clear() - Clearing all elements in the ArrayList
    fruits.clear();
    System.out.println("After clearing the ArrayList: " + fruits);
  }
}
