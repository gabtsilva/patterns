package domain;

import java.util.List;

public class AND implements Strategy{
    List<Strategy> strategies;
    public AND(List<Strategy> strategies) {
        this.strategies = strategies;
    }
    @Override
    public boolean treatWord(String word) {
        for (Strategy strategy : strategies) {
            if(!strategy.treatWord(word)) return false ;
        }
        return true;
    }
}
