package domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ListWords {
    private String fileName;
    public ListWords(String fileName) {
        this.fileName = fileName;
    }
    public void treat(Strategy strategy) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(this.fileName));
        String line = null;
        while ((line = input.readLine()) != null) {
            StringTokenizer words = new StringTokenizer(line, " \t.;(){}\"'*=:!/\\");
            while (words.hasMoreTokens()) {
                String word = words.nextToken();
                strategy.treatWord(word);
            }
        }
    }
}
