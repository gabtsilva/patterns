package main;

import domain.ListWords;
import domain.PalindromeStrategy;
import domain.StartsWithStrategy;
import domain.WordOfLengthStrategy;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ListWords listWords = new ListWords(args[0]);
        listWords.treat(new WordOfLengthStrategy(5));
    }
}
