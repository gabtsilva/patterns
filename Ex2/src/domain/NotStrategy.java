package domain;

public class NotStrategy implements Strategy{
    private final Strategy strategy;
    public NotStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public boolean treatWord(String word) {
        return !this.strategy.treatWord(word);
    }
}
