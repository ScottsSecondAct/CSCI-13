package FunWithArrays;
public class JaggedArray {
  /*
   * The code below creates a jagged array of integers. The array is 5 elements
   * long, but each element is an array of integers of varying length. The
   * lengths of the arrays are 1, 2, 3, 4, and 5. The elements of the arrays are
   * the sum of the indices of the element and the index of the inner array.
   */
  public static void main(String[] args) {
    int[][] jagged = new int[5][];

    for (int i = 0; i < jagged.length; i++) {
      jagged[i] = new int[i + 1];
      for (int j = 0; j < jagged[i].length; j++) {
        jagged[i][j] = i + j;
      }
    }

    for (int i = 0; i < jagged.length; i++) {
      for (int j = 0; j < jagged[i].length; j++) {
        System.out.print(jagged[i][j] + " ");
      }
      System.out.println();
    }
  }
}
