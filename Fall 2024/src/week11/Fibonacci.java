public class Fibonacci {
  private static int iterations = 0;
  public static int fibonacci(int n) {
    System.out.println("Calculating Fibonacci of: " + n);
    iterations++;
    if (n <= 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {
    int n = 10; // Example: calculate the 10th Fibonacci number
    long startTime = System.nanoTime();
    System.out.println("Fibonacci number " + n + " is: " + fibonacci(n));
    System.out.println("Total iterations: " + iterations);
    long endTime = System.nanoTime();
    System.out.println(endTime - startTime);
  }
}