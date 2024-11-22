import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoization {

  private static Map<Integer, Integer> memo = new HashMap<>();

  public static int fibonacci(int n) {
    // Check if value is already computed
    if (memo.containsKey(n)) {
      return memo.get(n);
    }
    int result;
    // Base Cases
    if (n == 0) {
      result = 0;
    } else if (n == 1) {
      result = 1;
    }
    // Recursive Case with Memoization
    else {
      result = fibonacci(n - 1) + fibonacci(n - 2);
    }
    // Store result in memoization map
    memo.put(n, result);
    return result;
  }

  public static void main(String[] args) {
    int n = 40; // Larger input
    int result = fibonacci(n);
    System.out.println("Fibonacci number at position " + n + " is " + result);
  }
}
