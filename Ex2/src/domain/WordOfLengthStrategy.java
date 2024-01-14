package domain;

import java.util.StringTokenizer;

public class WordOfLengthStrategy implements Strategy{
    private int length;
    public WordOfLengthStrategy(int length) {
        this.length = length;
    }
    public void treatWord(String word) {
            if (word.length() == this.length)
                System.out.println(word);
    }
}
