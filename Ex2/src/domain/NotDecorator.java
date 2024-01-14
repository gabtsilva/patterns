package domain;

public class NotDecorator implements Strategy{
    private final Strategy strategy;
    public NotDecorator(Strategy strategy) {
        this.strategy = strategy;
    }
    public boolean treatWord(String word) {
        return !this.strategy.treatWord(word);
    }
}
