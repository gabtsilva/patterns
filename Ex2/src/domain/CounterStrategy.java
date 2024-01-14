package domain;

public class CounterStrategy implements Strategy {
    private Strategy strategy;
    private int counter;

    public CounterStrategy(Strategy strategy) {
        this.strategy = strategy;
        this.counter = 0;
    }

    public boolean treatWord(String word) {
        if(strategy.treatWord(word)) {
            this.counter++;
            return true;
        }
        return false;
    }

    public void printCounter() {
        System.out.println("Counter : " + this.counter);
    }
}
