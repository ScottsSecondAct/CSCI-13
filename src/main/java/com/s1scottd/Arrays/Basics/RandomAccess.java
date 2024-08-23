public class RandomAccess {
  /*
   * This program demonstrates random access of elements in an array.
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {
    // Initialize an array with some elements
    int[] numbers = { 10, 20, 30, 40, 50 };

    // Access and print elements using their index
    System.out.println("Element at index 0: " + numbers[0]); // Output: 10
    System.out.println("Element at index 2: " + numbers[2]); // Output: 30
    System.out.println("Element at index 4: " + numbers[4]); // Output: 50

    // Modify an element at a specific index
    numbers[2] = 35; // Changing the value at index 2 from 30 to 35

    // Access and print the modified element
    System.out.println("Modified element at index 2: " + numbers[2]); // Output: 35
  }
}