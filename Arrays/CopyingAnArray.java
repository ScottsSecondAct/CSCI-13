import java.util.Arrays;

public class CopyingAnArray {
  public static void main(String[] args) {
    int[] source = { 3, 4, 5, 6, 7 };
    int[] largerSource = Arrays.copyOf(source, source.length * 2);
    int[] smallerSource = Arrays.copyOf(source, source.length / 2);

    System.out.println("The source array:");
    System.out.println(Arrays.toString(source));
    System.out.println("The larger source array:");
    System.out.println(Arrays.toString(largerSource));
    System.out.println("The smaller source array:");
    System.out.println(Arrays.toString(smallerSource));
  }
}
