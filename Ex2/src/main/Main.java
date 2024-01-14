package main;

import domain.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ListWords listWords = new ListWords(args[0]);
        listWords.treat(new AndDecorator(new StartsWithStrategy('a'), new WordOfLengthStrategy(3)));
    }
}
