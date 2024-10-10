package LinkedList;
class LinkedListSorter<T extends Comparable<T>> {

  // Method to sort the linked list
  public Node<T> sort(Node<T> head) {
    if (head == null || head.next == null) {
      return head;
    }

    // Step 1: Split the list into two halves
    Node<T> middle = getMiddle(head);
    Node<T> nextOfMiddle = middle.next;
    middle.next = null;

    // Step 2: Recursively sort each half
    Node<T> left = sort(head);
    Node<T> right = sort(nextOfMiddle);

    // Step 3: Merge the sorted halves
    return merge(left, right);
  }

  // Helper method to find the middle of the linked list
  private Node<T> getMiddle(Node<T> head) {
    if (head == null)
      return head;

    Node<T> slow = head;
    Node<T> fast = head;

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  // Helper method to merge two sorted linked lists
  private Node<T> merge(Node<T> left, Node<T> right) {
    Node<T> result;

    if (left == null)
      return right;
    if (right == null)
      return left;

    if (left.data.compareTo(right.data) <= 0) {
      result = left;
      result.next = merge(left.next, right);
    } else {
      result = right;
      result.next = merge(left, right.next);
    }
    return result;
  }
}
