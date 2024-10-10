import java.util.*;

public class VocabularyManager {
  private List<Word> words;

  public VocabularyManager() {
    words = new ArrayList<>();
  }

  public void addWord(String word) {
    for (Word w : words) {
      if (w.getWord().equals(word)) {
        words.set(words.indexOf(w), new Word(word, w.getFrequency() + 1));
        return;
      }
    }
    words.add(new Word(word, 1));
  }

  public void filterStopWords(List<String> stopWords) {
    words.removeIf(word -> stopWords.contains(word.getWord()));
  }

  public void sortWordsByFrequency() {
    Collections.sort(words);
  }

  public int getWordFrequency(String word) {
    for (Word w : words) {
      if (w.getWord().equals(word)) {
        return w.getFrequency();
      }
    }
    return 0;
  }

  public List<Word> getTopNFrequentWords(int n) {
    return words.subList(0, Math.min(n, words.size()));
  }

  public void displayTopNFrequentWords(int n) {
    List<Word> topWords = getTopNFrequentWords(n);
    for (Word w : topWords) {
      System.out.println(w);
    }
  }
}
