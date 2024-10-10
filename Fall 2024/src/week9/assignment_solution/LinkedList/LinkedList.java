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
 
package LinkedList;

import java.util.Iterator;
import java.util.function.Predicate;

public class LinkedList<T extends Comparable<T>> implements Iterable<T> {
  // package only scope references
  Node<T> head;
  Node<T> tail;
  int size;

  // Constructor
  public LinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  // Add a new element to the end of the list
  public void add(T data) {
    if (head == null) {
      head = new Node<>(data);
      tail = head;
    } else {
      tail.next = new Node<>(data);
      tail = tail.next;
    }
    size++;
  }

  public void add(int index, T element) {
    // Validate index
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Invalid index");
    }

    Node<T> newNode = new Node<>(element);

    // Special case for inserting at the beginning
    if (index == 0) {
      newNode.next = head;
      head = newNode;
    } else {
      // Traverse to the node before the specified index
      Node<T> current = head;
      for (int i = 0; i < index - 1; i++) {
        current = current.next;
      }
      // Insert the new node
      newNode.next = current.next;
      current.next = newNode;
    }

    size++; // Update the size of the list
  }

  // Add a new element to the beginning of the list
  public void addFirst(T data) {
    Node<T> newNode = new Node<>(data);
    newNode.next = head;
    head = newNode;
    if (tail == null) {
      tail = head;
    }
    size++;
  }

  // Add a new element at the specified index
  public void set(int index, T data) {
    Node<T> current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    current.data = data;
  }

  // Get the element at the specified index
  public T get(int index) {
    Node<T> current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    return current.data;
  }

  // Remove the element at the specified index
  public void remove(int index) {
    if (index == 0) {
      head = head.next;
      size--;
      return;
    }

    Node<T> current = head;
    for (int i = 0; i < index - 1; i++) {
      current = current.next;
    }
    current.next = current.next.next;
    if (current.next == null) {
      tail = current;
    }
    size--;
  }

  // Remove the first occurrence of the specified element
  public boolean contains(T data) {
    Node<T> current = head;
    while (current != null) {
      if (current.data.equals(data)) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  // Find the index of the first occurrence of the specified element
  public int indexOf(T data) {
    Node<T> current = head;
    int index = 0;
    while (current != null) {
      if (current.data.equals(data)) {
        return index;
      }
      current = current.next;
      index++;
    }
    return -1;
  }

  // Return the size of the list
  public int size() {
    return size;
  }

  // Check if the list is empty
  public boolean isEmpty() {
    return head == null;
  }

  // Clear the list
  public void clear() {
    head = null;
    tail = null;
    size = 0;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    Node<T> current = head;
    while (current != null) {
      sb.append(current.data).append(" -> ");
      current = current.next;
    }
    sb.append("null]");
    return sb.toString();
  }

  /**
   * Helper Classes and Methods
   */

  // Return an iterator for the list
  @Override
  public Iterator<T> iterator() {
    return new LinkedListIterator<>(head);
  }

  // Sort a linked list
  public void sort() {
    LinkedListSorter<T> sorter = new LinkedListSorter<>();
    head = sorter.sort(head);
  }

  // Remove elements based on a predicate.
  public void removeIf(Predicate<T> filter) {
    LinkedListFilter<T> linkedListFilter = new LinkedListFilter<>();
    linkedListFilter.removeIf(this, filter);
  }

  // Return a sublist.
  public LinkedList<T> subList(int fromIndex, int toIndex) {
    LinkedListSublister<T> sublists = new LinkedListSublister<>();
    return sublists.subList(this, fromIndex, toIndex);
  }
}
