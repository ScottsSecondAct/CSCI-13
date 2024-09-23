package FunWithArrays;
import java.util.Arrays;

public class ComparingArrays {
  public static void main(String[] args) {
    int[] array1 = { 1, 2, 3 };
    int[] array2 = { 1, 2, 3 };

    boolean isEqual = Arrays.equals(array1, array2);
    if (isEqual) {
      System.out.println("The two arrays are equal.");
    } else {
      System.out.println("The two arrays are not equal.");
    }
  }
}
