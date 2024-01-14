package domain;

public class WordCountObserver implements Observer{
    private int count;
    @Override
    public void update(String line) {
        count += line.trim().split(" ").length;
    }
    public void end() {
        System.out.println("Ce fichier contient " + count + " mot(s).");
    }
}
