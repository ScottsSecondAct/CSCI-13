/**
 * MIT License
 *
 * Copyright (c) 2024 Scott Davis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
 
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

    parser.parseTextFile(filepath); // Replace with actual text file path

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
