public class SortingTest {
  public static void main(String[] args) {
    int[] sampleArray = { 64, 25, 12, 22, 11 }; // You can change this to test different sizes
    // int[] sampleArray = new int[256];
    // for (int i = 0; i < 256; i++) {
    //   sampleArray[i] = (int)(Math.random() * 1000);
    // }

    // Create copies of the sampleArray for each sorting method
    int[] bubbleArray = sampleArray.clone();
    int[] insertionArray = sampleArray.clone();
    int[] selectionArray = sampleArray.clone();
    int[] quickArray = sampleArray.clone();

    // Measure time for Bubble Sort
    long startBubble = System.nanoTime();
    SortingAlgorithms.bubbleSort(bubbleArray);
    long endBubble = System.nanoTime();
    System.out.println("Bubble Sort took " + (endBubble - startBubble) + " ns");

    // Measure time for Insertion Sort
    long startInsertion = System.nanoTime();
    SortingAlgorithms.insertionSort(insertionArray);
    long endInsertion = System.nanoTime();
    System.out.println("Insertion Sort took " + (endInsertion - startInsertion) + " ns");

    // Measure time for Selection Sort
    long startSelection = System.nanoTime();
    SortingAlgorithms.selectionSort(selectionArray);
    long endSelection = System.nanoTime();
    System.out.println("Selection Sort took " + (endSelection - startSelection) + " ns");

    // Measure time for Selection Sort
    long startQuickSort = System.nanoTime();
    SortingAlgorithms.quickSort(quickArray, 0, quickArray.length - 1);
    long endQuickSort = System.nanoTime();
    System.out.println("Quick Sort took " + (endQuickSort - startQuickSort) + " ns");
  }
}
