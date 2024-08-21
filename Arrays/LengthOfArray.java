public class LengthOfArray {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5 };
    System.out.println("The length of the array is: " + numbers.length);

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("The element at index " + i + " is: " + numbers[i]);
    }

    // Common Mistakes:
    // 1. Using the length property with parentheses: numbers.length()
    // 2. Using the length property as an index: numbers[numbers.length].  This will throw an ArrayIndexOutOfBoundsException.
    // 3. Attempting to use an array before it is instantiated: int[] numbers; numbers.length.  This will throw a NullPointerException.
  }
}
