package domain;

import java.util.StringTokenizer;

public class WordOfLengthStrategy implements Strategy{
    private final int length;
    public WordOfLengthStrategy(int length) {
        this.length = length;
    }
    public boolean treatWord(String word) {
            return word.length() == this.length;
    }
}
