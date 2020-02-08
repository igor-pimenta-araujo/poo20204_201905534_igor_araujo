package aula12.salaaula.observable.dieta;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Dieta extends Observable {
	private List<Observer> observers = new ArrayList<Observer>();
	private double peso;

	public Dieta() {
	}

	public Dieta(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		// Chama o método de atualização dos observers disponíveis.
		for (Observer ob : observers) {
			System.out.println("Notificando observers!");
			ob.update(null, this.peso);
		}
	}
}
