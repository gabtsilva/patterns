package domain;

public class SpecificWordObserver implements Observer{
    private String word;
    private int count;
    public SpecificWordObserver(String word) {
        this.word = word;
    }
    @Override
    public void update(String line) {
        if (line.contains(word)) count++;
    }
    public void end() {
        System.out.println("Ce fichier contient " + count + " fois le mot " + word + ".");
    }
}
