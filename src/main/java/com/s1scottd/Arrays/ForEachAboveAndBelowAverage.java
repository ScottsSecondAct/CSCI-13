public class ForEachAboveAndBelowAverage {
  public static void main(String[] args) {
    int grades[] = { 90, 80, 70, 60, 50 };
    int sum = 0;
    for (int grade : grades) {
      sum += grade;
    }

    double average = sum / (double) grades.length;

    int numberOfStudentsBelowAverage = 0;
    int numberOfStudentsAboveAverage = 0;

    for (int grade : grades) {
      if (grade < average) {
        numberOfStudentsBelowAverage++;
      } else if (grade > average) {
        numberOfStudentsAboveAverage++;
      }
    }

    System.out.println("The average of the three grades is: " + average);
    System.out.println("The number of students who scored below average is: " + numberOfStudentsBelowAverage);
    System.out.println("The number of students who scored above average is: " + numberOfStudentsAboveAverage);
  }
}
