import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class Files {
  /*
   * This program reads data from a file called "data.txt".
   * 
   * Example input in "data.txt":
   *  Hello, World!
   *  This is a file.
   * 
   */
  public static void main(String[] args) {
    File file = new File("data.txt");
    try {
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    }
  }
}
