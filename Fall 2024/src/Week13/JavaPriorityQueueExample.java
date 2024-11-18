import java.util.PriorityQueue;

public class JavaPriorityQueueExample {
  public static void main(String[] args) {
    // Create a PriorityQueue of integers
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    // Add elements to the priority queue
    priorityQueue.add(40);
    priorityQueue.add(10);
    priorityQueue.add(20);
    priorityQueue.add(30);

    // Display the elements of the priority queue
    System.out.println("Priority Queue: " + priorityQueue);

    // Peek at the element with the highest priority (smallest value)
    System.out.println("Peek: " + priorityQueue.peek()); // Output: 10

    // Remove elements from the priority queue
    System.out.println("Dequeue: " + priorityQueue.poll()); // Output: 10
    System.out.println("Dequeue: " + priorityQueue.poll()); // Output: 20

    // Display the remaining elements
    System.out.println("Priority Queue after dequeues: " + priorityQueue);

    // Add another element
    priorityQueue.add(5);
    System.out.println("Priority Queue after adding 5: " + priorityQueue);

    // Remove all elements
    while (!priorityQueue.isEmpty()) {
      System.out.println("Dequeue: " + priorityQueue.poll());
    }

    // Check if the priority queue is empty
    System.out.println("Is the Priority Queue empty? " + priorityQueue.isEmpty());
  }
}
