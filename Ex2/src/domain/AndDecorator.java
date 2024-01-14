package domain;

public class AndDecorator implements Strategy{
    private Strategy strategy1;
    private Strategy strategy2;
    public AndDecorator(Strategy strategy1, Strategy strategy2) {
        this.strategy1 = strategy1;
        this.strategy2 = strategy2;
    }
    public boolean treatWord(String word) {
        return this.strategy1.treatWord(word) && this.strategy2.treatWord(word);
    }
}
