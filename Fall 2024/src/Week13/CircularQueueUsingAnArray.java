public class CircularQueueUsingAnArray<T> {
  private T[] queue;
  private int front;
  private int rear;
  private int size;
  private int capacity;

  // Constructor to initialize the queue with a specified capacity
  @SuppressWarnings("unchecked")
  public CircularQueueUsingAnArray(int capacity) {
    this.capacity = capacity;
    queue = (T[]) new Object[capacity];
    front = -1;
    rear = -1;
    size = 0;
  }

  // Method to add an element to the queue
  public void enqueue(T element) throws IllegalStateException {
    if (isFull()) {
      throw new IllegalStateException("Queue is full");
    }
    if (front == -1) {
      front = 0; // Initialize front when first element is added
    }
    rear = (rear + 1) % capacity;
    queue[rear] = element;
    size++;
  }

  // Method to remove and return the front element of the queue
  public T dequeue() throws IllegalStateException {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }
    T element = queue[front];
    queue[front] = null; // Clear the slot for garbage collection
    front = (front + 1) % capacity;
    size--;
    if (size == 0) { // Reset pointers when the queue becomes empty
      front = -1;
      rear = -1;
    }
    return element;
  }

  // Method to peek at the front element without removing it
  public T peek() throws IllegalStateException {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }
    return queue[front];
  }

  // Check if the queue is empty
  public boolean isEmpty() {
    return size == 0;
  }

  // Check if the queue is full
  public boolean isFull() {
    return size == capacity;
  }

  // Get the current size of the queue
  public int getSize() {
    return size;
  }

  // Get the capacity of the queue
  public int getCapacity() {
    return capacity;
  }

  // Main method for testing the CircularQueueUsingAnArray
  public static void main(String[] args) {
    CircularQueueUsingAnArray<Integer> circularQueue = new CircularQueueUsingAnArray<>(5);

    try {
      // Enqueue elements
      circularQueue.enqueue(10);
      circularQueue.enqueue(20);
      circularQueue.enqueue(30);
      circularQueue.enqueue(40);
      circularQueue.enqueue(50);

      System.out.println("Dequeued: " + circularQueue.dequeue());
      System.out.println("Dequeued: " + circularQueue.dequeue());

      circularQueue.enqueue(60);
      circularQueue.enqueue(70);

      while (!circularQueue.isEmpty()) {
        System.out.println("Dequeued: " + circularQueue.dequeue());
      }
    } catch (IllegalStateException e) {
      System.err.println(e.getMessage());
    }
  }
}
