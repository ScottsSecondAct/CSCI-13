public class FibonacciRecursive {
  public static int fibonacci(int n) {
    // Base Cases
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }
    // Recursive Case
    else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static void main(String[] args) {
    int n = 5; // Example input
    int result = fibonacci(n);
    System.out.println("Fibonacci number at position " + n + " is " + result);
  }
}
