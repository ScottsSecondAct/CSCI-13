public class FactorialIterative {
  public static int factorial(int n) {
    int result = 1;
    // Iterative loop
    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  public static void main(String[] args) {
    int number = 5;
    System.out.println(number + "! = " + factorial(number));
  }
}