package LinkedList;

import java.util.function.Predicate;

public class LinkedListFilter<T extends Comparable<T>> {
  /**
   * Removes elements from the linked list based on the given filter condition.
   *
   * @param list   the linked list from which elements are to be removed
   * @param filter the condition for removing elements
   * @throws NullPointerException if the provided list is null
   */
  public void removeIf(LinkedList<T> list, Predicate<T> filter) {
    if (list == null || list.head == null)
      return;

    // Remove matching elements from the head
    while (list.head != null && filter.test(list.head.data)) {
      list.head = list.head.next;
      list.size--; // Update size
    }

    // Remove matching elements from the rest of the list
    Node<T> current = list.head;
    while (current != null && current.next != null) {
      if (filter.test(current.next.data)) {
        current.next = current.next.next;
        list.size--; // Update size
      } else {
        current = current.next;
      }
    }
  }
}