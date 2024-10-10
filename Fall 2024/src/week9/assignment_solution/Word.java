public class Word implements Comparable<Word> {
    private String word;
    private int frequency;

    public Word(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    public String getWord() {
        return word;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public int compareTo(Word other) {
        return Integer.compare(other.frequency, this.frequency); // Descending order
    }

    @Override
    public String toString() {
        return word + ": " + frequency;
    }
}
