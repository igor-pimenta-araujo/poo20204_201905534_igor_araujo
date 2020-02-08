package aula12.as10b.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Alarme extends Observable implements Observer {
	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void update(Observable o, Object arg) {

	}

	public void update() {

	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void testa() {}


}
