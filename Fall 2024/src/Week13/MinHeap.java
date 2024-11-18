import java.util.ArrayList;

public class MinHeap {
  private ArrayList<Integer> heap;

  // Constructor
  public MinHeap() {
    heap = new ArrayList<>();
  }

  // Insert an element into the heap
  public void insert(int value) {
    heap.add(value);
    heapifyUp(heap.size() - 1);
  }

  // Remove and return the smallest element
  public int removeMin() {
    if (heap.isEmpty()) {
      throw new IllegalStateException("Heap is empty");
    }
    int min = heap.get(0);
    int last = heap.remove(heap.size() - 1);
    if (!heap.isEmpty()) {
      heap.set(0, last);
      heapifyDown(0);
    }
    return min;
  }

  // Peek at the smallest element without removing it
  public int peek() {
    if (heap.isEmpty()) {
      throw new IllegalStateException("Heap is empty");
    }
    return heap.get(0);
  }

  // Helper to restore heap property upwards
  private void heapifyUp(int index) {
    while (index > 0) {
      int parentIndex = (index - 1) / 2;
      if (heap.get(index) < heap.get(parentIndex)) {
        swap(index, parentIndex);
        index = parentIndex;
      } else {
        break;
      }
    }
  }

  // Helper to restore heap property downwards
  private void heapifyDown(int index) {
    int smallest = index;
    int left = 2 * index + 1;
    int right = 2 * index + 2;

    if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
      smallest = left;
    }
    if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
      smallest = right;
    }

    if (smallest != index) {
      swap(index, smallest);
      heapifyDown(smallest);
    }
  }

  // Helper to swap two elements
  private void swap(int i, int j) {
    int temp = heap.get(i);
    heap.set(i, heap.get(j));
    heap.set(j, temp);
  }

  // Main method for testing
  public static void main(String[] args) {
    MinHeap minHeap = new MinHeap();
    minHeap.insert(40);
    minHeap.insert(10);
    minHeap.insert(20);
    minHeap.insert(30);

    System.out.println("Min element: " + minHeap.peek()); // Output: 10
    System.out.println("Removed: " + minHeap.removeMin()); // Output: 10
    System.out.println("Min element: " + minHeap.peek()); // Output: 20
  }
}
