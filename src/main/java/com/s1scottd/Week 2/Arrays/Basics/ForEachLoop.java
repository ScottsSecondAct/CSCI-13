public class ForEachLoop {
  /*
   * This program demonstrates using a For-Each loop to iterate through an array.
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {
    int grades[] = { 90, 80, 70, 60, 50 };
    int sum = 0;

    // Using a For-Each loop to iterate through the array
    for (int grade : grades) {
      sum += grade;
    }

    double average = sum / (double) grades.length;
    System.out.println("The average of the three grades is: " + average);
  }
}
