package LinkedList;

/**
 * Utility class for performing operations on LinkedList.
 */
class LinkedListSublister<T extends Comparable<T>> {

  /**
   * Creates a sublist from the specified range [fromIndex, toIndex).
   *
   * @param list      the original linked list
   * @param fromIndex the start index (inclusive)
   * @param toIndex   the end index (exclusive)
   * @return a new LinkedList containing the specified range of elements
   * @throws IndexOutOfBoundsException if fromIndex or toIndex is out of range
   */
  public LinkedList<T> subList(LinkedList<T> list, int fromIndex, int toIndex) {
    if (fromIndex < 0 || toIndex > list.size() || fromIndex > toIndex) {
      throw new IndexOutOfBoundsException("Invalid fromIndex or toIndex");
    }

    LinkedList<T> subList = new LinkedList<>();
    Node<T> current = list.head;
    int index = 0;

    // Traverse to the starting index
    while (current != null && index < fromIndex) {
      current = current.next;
      index++;
    }

    // Add elements from fromIndex to toIndex
    while (current != null && index < toIndex) {
      subList.add(current.data);
      current = current.next;
      index++;
    }

    return subList;
  }
}