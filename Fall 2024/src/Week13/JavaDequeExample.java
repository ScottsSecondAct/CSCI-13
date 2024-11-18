import java.util.Deque;
import java.util.ArrayDeque;

public class JavaDequeExample {
  public static void main(String[] args) {
    // Create a Deque using ArrayDeque
    Deque<String> deque = new ArrayDeque<>();

    // Adding elements to the Deque
    deque.addFirst("Alice"); // Add to the front
    deque.addLast("Bob"); // Add to the rear
    deque.offerFirst("Carol"); // Add to the front
    deque.offerLast("Dave"); // Add to the rear

    // Display the Deque
    System.out.println("Deque after additions: " + deque);

    // Peek elements
    System.out.println("Peek First: " + deque.peekFirst()); // Output: Carol
    System.out.println("Peek Last: " + deque.peekLast()); // Output: Dave

    // Remove elements from the Deque
    System.out.println("Remove First: " + deque.removeFirst()); // Output: Carol
    System.out.println("Remove Last: " + deque.removeLast()); // Output: Dave

    // Display the Deque after removals
    System.out.println("Deque after removals: " + deque);

    // Add elements to demonstrate iteration
    deque.addLast("Eve");
    deque.addLast("Frank");

    // Iterate through the Deque
    System.out.println("Iterating through the Deque:");
    for (String name : deque) {
      System.out.println(name);
    }

    // Clear the Deque
    deque.clear();
    System.out.println("Is the Deque empty? " + deque.isEmpty()); // Output: true
  }
}
