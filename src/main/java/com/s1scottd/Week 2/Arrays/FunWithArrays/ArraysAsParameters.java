package FunWithArrays;
public class ArraysAsParameters {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5 };

    printArray(numbers);

    System.out.println("\nThe array after doubling returning int[]:");
    int[] doubledArray = doubleArrayWithReturn(numbers);
    for (int i = 0; i < doubledArray.length; i++) {
      System.out.print(doubledArray[i] + " ");
    }
    System.out.println();

    printArray(numbers);

    System.out.println("\nThe array after doubling returning void:");
    doubleArray(numbers);
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();

    printArray(numbers);
  }

  public static int[] doubleArrayWithReturn(int[] array) {
    int newArray[] = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i] * 2;
    }
    return newArray;
  }

  public static void doubleArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] *= 2;
    }
  }

  public static void printArray(int[] array) {
    System.out.println("\nnumbers:");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
