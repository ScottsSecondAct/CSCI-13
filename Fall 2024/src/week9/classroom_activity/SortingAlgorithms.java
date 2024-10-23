public class SortingAlgorithms {

  // Bubble Sort implementation
  public static void bubbleSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          // Swap array[j] and array[j + 1]
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  // Insertion Sort implementation
  public static void insertionSort(int[] array) {
    int n = array.length;
    for (int i = 1; i < n; i++) {
      int key = array[i];
      int j = i - 1;

      // Move elements of array[0..i-1], that are greater than key,
      // to one position ahead of their current position
      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j = j - 1;
      }
      array[j + 1] = key;
    }
  }

  // Selection Sort implementation
  public static void selectionSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      // Find the minimum element in the unsorted part
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      // Swap the found minimum element with the first element
      int temp = array[minIndex];
      array[minIndex] = array[i];
      array[i] = temp;
    }
  }

  // Main QuickSort function that takes an array and sorts it using recursion
  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      // Partition the array and get the pivot index
      int pivotIndex = partition(arr, low, high);

      // Recursively sort the elements before and after the pivot
      quickSort(arr, low, pivotIndex - 1); // Sort the left sub-array
      quickSort(arr, pivotIndex + 1, high); // Sort the right sub-array
    }
  }

  // Partition function that places the pivot in the correct position
  private static int partition(int[] arr, int low, int high) {
    // Choose the last element as the pivot
    int pivot = arr[high];
    int i = low - 1; // Index of the smaller element

    // Traverse the array and rearrange elements
    for (int j = low; j < high; j++) {
      if (arr[j] < pivot) {
        i++;
        // Swap arr[i] and arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    // Place the pivot in its correct position
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1; // Return the pivot index
  }
}