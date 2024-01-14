package domain;

public class LineCountObserver implements Observer{
    private int count;
    @Override
    public void update(String line) {
        count++;
    }
    public void end() {
        System.out.println("Ce fichier contient " + count + " ligne(s).");
    }
}
