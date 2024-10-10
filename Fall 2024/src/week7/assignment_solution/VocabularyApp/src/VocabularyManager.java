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
