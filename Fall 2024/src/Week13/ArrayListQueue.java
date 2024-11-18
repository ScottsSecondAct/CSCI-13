import java.util.ArrayList;

public class ArrayListQueue<T> {

  private ArrayList<T> queue;

  // Constructor to initialize the queue
  public ArrayListQueue() {
    queue = new ArrayList<>();
  }

  // Method to add an element to the rear of the queue
  public void enqueue(T element) {
    queue.add(element);
  }

  // Method to remove and return the front element of the queue
  public T dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }
    return queue.remove(0);
  }

  // Method to peek at the front element without removing it
  public T peek() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }
    return queue.get(0);
  }

  // Method to check if the queue is empty
  public boolean isEmpty() {
    return queue.isEmpty();
  }

  // Method to get the size of the queue
  public int getSize() {
    return queue.size();
  }

  // Main method for testing the ArrayListQueue
  public static void main(String[] args) {
    ArrayListQueue<Integer> queue = new ArrayListQueue<>();

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
