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

  // Add your methods here

  // End Add your methods here

  /**
   * Helper Classes and Methods - DO NOT MODIFY OR REMOVE
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
