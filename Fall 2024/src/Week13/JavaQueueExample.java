import java.util.*;

public class JavaQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements
        queue.add("Alice");
        queue.add("Bob");
        queue.offer("Charlie");

        // Accessing elements
        System.out.println("Peek: " + queue.peek()); // Output: Alice

        // Removing elements
        System.out.println("Poll: " + queue.poll()); // Output: Alice
        System.out.println("Remove: " + queue.remove()); // Output: Bob

        // Checking empty
        System.out.println("Is Queue Empty? " + queue.isEmpty()); // Output: false
    }
}