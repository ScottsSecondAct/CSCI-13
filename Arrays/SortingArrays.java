import java.util.Arrays;

public class SortingArrays {
  public static void main(String[] args) {
    int numbers[] = { 50, 22, 88, 87, 44 };
    String numbersAsString = Arrays.toString(numbers);
    System.out.println(numbersAsString);

    Arrays.sort(numbers);
    numbersAsString = Arrays.toString(numbers);
    System.out.println(numbersAsString);
  }
}