import java.io.File;
import java.util.List;
import java.util.Scanner;

public class VocabularyApp {

  public static void main(String[] args) {
    VocabularyManager manager = new VocabularyManager();
    TextParser parser = new TextParser(manager);
    Scanner scanner = new Scanner(System.in);

    String filepath = getFilePath(scanner);
    if (filepath.isEmpty()) {
      System.out.println("No file provided. Exiting program.");
      System.exit(0);
    }

    parser.parseTextFile(filepath);

    // Stop words filter
    manager.filterStopWords(List.of("the", "is", "in", "and", "a", "to", "of", "with", "on", "for", "by"));

    // Sort words by frequency
    manager.sortWordsByFrequency();

    // Display top 10 words
    System.out.println("Top 10 frequent words:");
    manager.displayTopNFrequentWords(10);

    // Search for word frequency
    findWordFrequency(scanner, manager);

    scanner.close();
  }

  private static String getFilePath(Scanner scanner) {
    String filepath = "";

    do {
      System.out.print("Enter the path of the text file to parse (or press Enter to quit): ");
      filepath = scanner.nextLine();

      // If the input is empty, return empty string
      if (filepath.isEmpty()) {
        return ""; // Exit condition if the user provides an empty input
      }

      File file = new File(filepath);

      // If file exists, return the filepath
      if (file.exists()) {
        return filepath;
      } else {
        System.out.println("File not found. Please try again.");
      }

    } while (true); // Continue looping until a valid filepath is provided or the user quits
  }

  public static void findWordFrequency(Scanner scanner, VocabularyManager manager) {
    String word = "";
    do {
      System.out.print("\nEnter a word to find its frequency (or press Enter to quit): ");
      word = scanner.nextLine();

      // Exit the loop if the user enters an empty string
      if (word.isEmpty()) {
        System.out.println("Exiting.");
        break;
      }

      System.out.println("Frequency of '" + word + "': " + manager.getWordFrequency(word));

    } while (true); // Keep looping until an empty string is entered
  }
}
