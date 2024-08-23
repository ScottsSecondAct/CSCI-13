public class ArrayUtils<T> {
  public static <T> void printArray(T[] array, String name) {
    for (int i = 0; i < array.length; i++) {
      if (name != null && !name.isEmpty()) {
        System.out.println(name + "[" + i + "] is " + array[i]);
      } else {
        System.out.println(array[i]);
      }
    }
  }

  public static <T> void printArray(T[] array) {
    printArray(array, "");
  }

  public static void printArray(int[] array, String name) {
    for (int i = 0; i < array.length; i++) {
      if (name != null && !name.isEmpty()) {
        System.out.println(name + "[" + i + "] is " + array[i]);
      } else {
        System.out.println(array[i]);
      }
    }
  }

  public static void printArray(int[] array) {
    printArray(array, "");
  }

  public static void printArray(double[] array, String name) {
    for (int i = 0; i < array.length; i++) {
      if (name != null && !name.isEmpty()) {
        System.out.println(name + "[" + i + "] is " + array[i]);
      } else {
        System.out.println(array[i]);
      }
    }
  }

  public static void printArray(double[] array) {
    printArray(array, "");
  }

  public static void printArray(boolean[] array, String name) {
    for (int i = 0; i < array.length; i++) {
      if (name != null && !name.isEmpty()) {
        System.out.println(name + "[" + i + "] is " + array[i]);
      } else {
        System.out.println(array[i]);
      }
    }
  }

  public static void printArray(boolean[] array) {
    printArray(array, "");
  }

  public static void printArray(char[] array, String name) {
    for (int i = 0; i < array.length; i++) {
      if (name != null && !name.isEmpty()) {
        System.out.println(name + "[" + i + "] is " + array[i]);
      } else {
        System.out.println(array[i]);
      }
    }
  }

  public static <T> void printArray(char[] array) {
    printArray(array, "");
  }
}