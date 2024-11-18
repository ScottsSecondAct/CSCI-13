import java.util.ArrayList;

public class PriorityQueue<T extends Comparable<T>> {
  private ArrayList<T> heap;

  // Constructor to initialize the priority queue
  public PriorityQueue() {
    heap = new ArrayList<>();
  }

  // Method to add an element to the priority queue
  public void enqueue(T element) {
    heap.add(element);
    heapifyUp(heap.size() - 1); // Restore heap property
  }

  // Method to remove and return the element with the highest priority
  public T dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Priority queue is empty");
    }
    T highestPriority = heap.get(0);
    T lastElement = heap.remove(heap.size() - 1);
    if (!heap.isEmpty()) {
      heap.set(0, lastElement);
      heapifyDown(0); // Restore heap property
    }
    return highestPriority;
  }

  // Method to peek at the element with the highest priority without removing it
  public T peek() {
    if (isEmpty()) {
      throw new IllegalStateException("Priority queue is empty");
    }
    return heap.get(0);
  }

  // Method to check if the priority queue is empty
  public boolean isEmpty() {
    return heap.isEmpty();
  }

  // Method to get the size of the priority queue
  public int getSize() {
    return heap.size();
  }

  // Helper method to restore the heap property upwards
  private void heapifyUp(int index) {
    while (index > 0) {
      int parentIndex = (index - 1) / 2;
      if (heap.get(index).compareTo(heap.get(parentIndex)) < 0) {
        swap(index, parentIndex);
        index = parentIndex;
      } else {
        break;
      }
    }
  }

  // Helper method to restore the heap property downwards
  private void heapifyDown(int index) {
    int smallest = index;
    int leftChild = 2 * index + 1;
    int rightChild = 2 * index + 2;

    if (leftChild < heap.size() && heap.get(leftChild).compareTo(heap.get(smallest)) < 0) {
      smallest = leftChild;
    }
    if (rightChild < heap.size() && heap.get(rightChild).compareTo(heap.get(smallest)) < 0) {
      smallest = rightChild;
    }

    if (smallest != index) {
      swap(index, smallest);
      heapifyDown(smallest);
    }
  }

  // Helper method to swap two elements in the heap
  private void swap(int i, int j) {
    T temp = heap.get(i);
    heap.set(i, heap.get(j));
    heap.set(j, temp);
  }

  // Main method for testing the GenericPriorityQueue
  public static void main(String[] args) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    // Enqueue elements
    priorityQueue.enqueue(40);
    priorityQueue.enqueue(10);
    priorityQueue.enqueue(30);
    priorityQueue.enqueue(20);
    priorityQueue.enqueue(50);

    // Peek at the element with the highest priority
    System.out.println("Peek: " + priorityQueue.peek()); // Output: 10

    // Dequeue elements
    while (!priorityQueue.isEmpty()) {
      System.out.println("Dequeued: " + priorityQueue.dequeue());
    }
    // Output: 10, 20, 30, 40, 50
  }
}
