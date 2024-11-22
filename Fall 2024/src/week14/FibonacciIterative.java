public class FibonacciIterative {

  public static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    }
    int[] fib = new int[n + 1];
    // Base Cases
    fib[0] = 0;
    fib[1] = 1;
    // Build table iteratively
    for (int i = 2; i <= n; i++) {
      fib[i] = fib[i - 1] + fib[i - 2];
    }
    return fib[n];
  }

  public static void main(String[] args) {
    int n = 40; // Example input
    int result = fibonacci(n);
    System.out.println("Fibonacci number at position " + n + " is " + result);
  }
}
