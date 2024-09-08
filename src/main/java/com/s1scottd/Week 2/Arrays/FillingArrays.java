import java.util.Arrays;

public class FillingArrays {
  public static void main(String[] args) {
    int[] numbers = new int[5];
    Arrays.fill(numbers, -1);

    for (int number : numbers) {
      System.out.println(number);
    }
  }
}
