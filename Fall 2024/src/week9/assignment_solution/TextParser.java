import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextParser {
  private VocabularyManager manager;

  public TextParser(VocabularyManager manager) {
    this.manager = manager;
  }

  public void parseTextFile(String filePath) {
    try {
      Scanner scanner = new Scanner(new File(filePath));
      while (scanner.hasNext()) {
        String word = scanner.next().toLowerCase().replaceAll("[^a-zA-Z]", "");
        if (!word.isEmpty()) {
          manager.addWord(word);
        }
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
