package domain;

import java.util.StringTokenizer;

public class StartsWithStrategy implements Strategy{
    private final char letter;
    public StartsWithStrategy(char letter) {
        this.letter = letter;
    }
    public boolean treatWord(String word) {
        return word.charAt(0) == this.letter;
    }
}
