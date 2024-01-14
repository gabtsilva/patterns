package domain;

import java.util.ArrayList;
import java.util.List;

public class AnalyseurDeTexte {
	private List<Observer> observers = new ArrayList<>();
	public void addObserver(Observer o) {
		observers.add(o);
	}

	public void notifyObservers(String s) {
		for (Observer o : observers) {
			o.update(s);
		}
	}
	public void end() {
		for (Observer o : observers) {
			o.end();
		}
	}
}
