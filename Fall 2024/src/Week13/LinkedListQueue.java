public class LinkedListQueue<T> {
  private Node<T> front; // Points to the front of the queue
  private Node<T> rear; // Points to the rear of the queue
  private int size; // Tracks the number of elements in the queue

  // Inner class for a node
  private static class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
      this.data = data;
      this.next = null;
    }
  }

  // Constructor to initialize the queue
  public LinkedListQueue() {
    this.front = null;
    this.rear = null;
    this.size = 0;
  }

  // Method to add an element to the rear of the queue
  public void enqueue(T element) {
    Node<T> newNode = new Node<>(element);
    if (rear == null) {
      // If the queue is empty, both front and rear point to the new node
      front = rear = newNode;
    } else {
      // Add the new node at the end and update the rear pointer
      rear.next = newNode;
      rear = newNode;
    }
    size++;
  }

  // Method to remove and return the front element of the queue
  public T dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }
    T data = front.data;
    front = front.next; // Move the front pointer to the next node
    if (front == null) {
      rear = null; // If the queue becomes empty, rear is also null
    }
    size--;
    return data;
  }

  // Method to peek at the front element without removing it
  public T peek() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }
    return front.data;
  }

  // Method to check if the queue is empty
  public boolean isEmpty() {
    return size == 0;
  }

  // Method to get the size of the queue
  public int getSize() {
    return size;
  }

  // Main method for testing the LinkedListQueue
  public static void main(String[] args) {
    LinkedListQueue<Integer> queue = new LinkedListQueue<>();

    // Enqueue elements
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    // Peek at the front element
    System.out.println("Front element: " + queue.peek()); // Output: 10

    // Dequeue elements
    System.out.println("Dequeued: " + queue.dequeue()); // Output: 10
    System.out.println("Dequeued: " + queue.dequeue()); // Output: 20

    // Check if the queue is empty
    System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false

    // Enqueue another element
    queue.enqueue(40);
    System.out.println("Front element: " + queue.peek()); // Output: 30

    // Dequeue the remaining elements
    System.out.println("Dequeued: " + queue.dequeue()); // Output: 30
    System.out.println("Dequeued: " + queue.dequeue()); // Output: 40

    // Check if the queue is empty
    System.out.println("Is queue empty? " + queue.isEmpty()); // Output: true
  }
}
