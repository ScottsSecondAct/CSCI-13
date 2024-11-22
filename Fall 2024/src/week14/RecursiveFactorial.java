public class RecursiveFactorial {

    public static int factorial(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive Case
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5; // Example input
        int result = factorial(number);
        System.out.println(number + "! = " + result);
    }
}