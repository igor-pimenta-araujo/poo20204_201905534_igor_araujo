package aula12.as10b.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Sensor extends Observable{
	private List<Observer> alarmes = new ArrayList<Observer>();
	
	public void sensorAtivado() {
		this.notifyObservers();
	}
	
	
	public void notifyObservers() {
		System.out.println("O sensor detectou algo suspeito");
		for(Observer observador : alarmes) {
			System.out.println("Notificando alarme");
		}
	}
	
	public void registerObserver(Observer observador) {
		alarmes.add(observador);
	}
	
	public void removeObserver(Observer observador) {
		alarmes.remove(observador);
	}
}
