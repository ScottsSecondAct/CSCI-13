package FunWithArrays;
public class MultidimensionalArrays {
  public static void main(String[] args) {

    // 2D array
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    System.out.println("\nmatrix:");
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    // 3D array
    int[][][] cube = {
        {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        },
        {
            { 10, 11, 12 },
            { 13, 14, 15 },
            { 16, 17, 18 }
        },
        {
            { 19, 20, 21 },
            { 22, 23, 24 },
            { 25, 26, 27 }
        }
    };
    System.out.println("\ncube:");
    for (int i = 0; i < cube.length; i++) {
      for (int j = 0; j < cube[i].length; j++) {
        for (int k = 0; k < cube[i][j].length; k++) {
          System.out.print(cube[i][j][k] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
