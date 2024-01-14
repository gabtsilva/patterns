package domain;

import java.util.StringTokenizer;

public class StartsWithStrategy implements Strategy{
    private char letter;
    public StartsWithStrategy(char letter) {
        this.letter = letter;
    }
    public void treatWord(String word) {
            if (word.charAt(0) == this.letter)
                System.out.println(word);
    }
}
