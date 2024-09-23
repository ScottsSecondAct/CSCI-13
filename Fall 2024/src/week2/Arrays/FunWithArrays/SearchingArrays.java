package FunWithArrays;
import java.util.Arrays;

public class SearchingArrays {
  public static void main(String[] args) {
    int numbers[] = { 50, 22, 88, 87, 44 };
    int searchFor = 88;
    Arrays.sort(numbers);
    int index = Arrays.binarySearch(numbers, searchFor);


    if (index >= 0) {
      System.out.println("The number " + searchFor + " was found in the array at index" + index);
    } else {
      System.out.println("The number " + searchFor + " was not found in the array.");
    }
  }
}
