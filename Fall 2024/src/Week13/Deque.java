public class Deque<T> {
  private Node<T> front; // Points to the front of the deque
  private Node<T> rear; // Points to the rear of the deque
  private int size; // Tracks the number of elements in the deque

  // Inner class for a doubly linked list node
  private static class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  // Constructor to initialize the deque
  public Deque() {
    this.front = null;
    this.rear = null;
    this.size = 0;
  }

  // Method to add an element at the front
  public void addFirst(T element) {
    Node<T> newNode = new Node<>(element);
    if (isEmpty()) {
      front = rear = newNode;
    } else {
      newNode.next = front;
      front.prev = newNode;
      front = newNode;
    }
    size++;
  }

  // Method to add an element at the rear
  public void addLast(T element) {
    Node<T> newNode = new Node<>(element);
    if (isEmpty()) {
      front = rear = newNode;
    } else {
      newNode.prev = rear;
      rear.next = newNode;
      rear = newNode;
    }
    size++;
  }

  // Method to remove and return the front element
  public T removeFirst() {
    if (isEmpty()) {
      throw new IllegalStateException("Deque is empty");
    }
    T data = front.data;
    front = front.next;
    if (front == null) {
      rear = null; // The deque becomes empty
    } else {
      front.prev = null;
    }
    size--;
    return data;
  }

  // Method to remove and return the rear element
  public T removeLast() {
    if (isEmpty()) {
      throw new IllegalStateException("Deque is empty");
    }
    T data = rear.data;
    rear = rear.prev;
    if (rear == null) {
      front = null; // The deque becomes empty
    } else {
      rear.next = null;
    }
    size--;
    return data;
  }

  // Method to peek at the front element without removing it
  public T peekFirst() {
    if (isEmpty()) {
      throw new IllegalStateException("Deque is empty");
    }
    return front.data;
  }

  // Method to peek at the rear element without removing it
  public T peekLast() {
    if (isEmpty()) {
      throw new IllegalStateException("Deque is empty");
    }
    return rear.data;
  }

  // Method to check if the deque is empty
  public boolean isEmpty() {
    return size == 0;
  }

  // Method to get the size of the deque
  public int getSize() {
    return size;
  }

  // Main method for testing the GenericDeque
  public static void main(String[] args) {
    Deque<Integer> deque = new Deque<>();

    // Add elements to the deque
    deque.addFirst(10);
    deque.addLast(20);
    deque.addFirst(5);
    deque.addLast(30);

    // Peek elements
    System.out.println("Front element: " + deque.peekFirst()); // Output: 5
    System.out.println("Rear element: " + deque.peekLast()); // Output: 30

    // Remove elements
    System.out.println("Removed front: " + deque.removeFirst()); // Output: 5
    System.out.println("Removed rear: " + deque.removeLast()); // Output: 30

    // Check size
    System.out.println("Deque size: " + deque.getSize()); // Output: 2

    // Check remaining elements
    System.out.println("Front element: " + deque.peekFirst()); // Output: 10
    System.out.println("Rear element: " + deque.peekLast()); // Output: 20
  }
}
