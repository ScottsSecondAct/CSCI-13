import java.util.*;

import LinkedList.LinkedList;

public class VocabularyManager {
  private LinkedList<Word> words;

  public VocabularyManager() {
    words = new LinkedList<>();
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
    words.sort();
  }

  public int getWordFrequency(String word) {
    for (Word w : words) {
      if (w.getWord().equals(word)) {
        return w.getFrequency();
      }
    }
    return 0;
  }

  public LinkedList<Word> getTopNFrequentWords(int n) {
    return words.subList(0, Math.min(n, words.size()));
  }

  public void displayTopNFrequentWords(int n) {
    LinkedList<Word> topWords = getTopNFrequentWords(n);
    for (Word w : topWords) {
      System.out.println(w);
    }
  }
}
