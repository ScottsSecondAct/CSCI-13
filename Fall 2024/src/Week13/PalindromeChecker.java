import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeChecker {

  public static boolean isPalindrome(String input) {
    // Normalize the string: remove spaces, punctuation, and make lowercase
    String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    // Create a deque to store characters
    Deque<Character> deque = new ArrayDeque<>();

    // Add all characters to the deque
    for (char c : normalized.toCharArray()) {
      deque.addLast(c);
    }

    // Check for palindrome by comparing characters from both ends
    while (deque.size() > 1) {
      if (deque.removeFirst() != deque.removeLast()) {
        return false; // Not a palindrome
      }
    }

    return true; // Is a palindrome
  }

  public static void main(String[] args) {
    // Test cases
    String[] testStrings = {
        "A man, a plan, a canal, Panama",
        "racecar",
        "hello",
        "Was it a car or a cat I saw?",
        "No 'x' in Nixon"
    };

    for (String test : testStrings) {
      System.out.println("\"" + test + "\" is a palindrome: " + isPalindrome(test));
    }
  }
}
