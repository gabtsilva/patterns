package main;

import domain.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ListWords listWords = new ListWords(args[0]);
        CounterStrategy counter = new CounterStrategy(new StartsWithStrategy('a'));
        listWords.treat(counter);
        counter.printCounter();
    }
}
