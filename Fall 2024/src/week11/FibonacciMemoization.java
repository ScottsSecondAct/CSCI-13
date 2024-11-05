import java.util.HashMap;

public class FibonacciMemoization {
  private static int iterations = 0;

  // Create a HashMap to store previously calculated Fibonacci values
  private static HashMap<Integer, Integer> memo = new HashMap<>();

  public static int fibonacci(int n) {
    // Base cases
    System.out.println("Calculating Fibonacci of: " + n);
    iterations++;
    if (n <= 1) {
      return n;
    }

    // Check if Fibonacci value is already calculated and stored in the memo map
    if (memo.containsKey(n)) {
      return memo.get(n);
    }

    // Calculate the Fibonacci value and store it in the memo map
    int result = fibonacci(n - 1) + fibonacci(n - 2);
    memo.put(n, result);
    return result;
  }

  public static void main(String[] args) {
    int n = 20; // Example: calculate the 10th Fibonacci number
    long startTime = System.nanoTime();
    System.out.println("Fibonacci number " + n + " is: " + fibonacci(n));
    System.out.println("Total iterations: " + iterations);
    long endTime = System.nanoTime();
    System.out.println(endTime - startTime);
  }
}