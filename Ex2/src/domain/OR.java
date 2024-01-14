package domain;

import java.util.List;

public class OR implements Strategy{
    private List<Strategy> strategies;
    public OR(List<Strategy> strategies) {
        this.strategies = strategies;
    }
    @Override
    public boolean treatWord(String word) {
        for (Strategy strategy : strategies) {
            if (strategy.treatWord(word)) return true;
        }
        return false;
    }
}
