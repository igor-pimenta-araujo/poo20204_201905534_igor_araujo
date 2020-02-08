package aula12.as10b.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Sensor extends Observable{
	private List<Observer> alarmes = new ArrayList<Observer>();
	Alarme a = new Alarme();
	
	public void sensorAtivado() {
		this.notifyObservers();
	}
	
	
	public void notifyObservers() {
		System.out.println("O sensor detectou algo suspeito");
			System.out.println("Notificando alarme");
			a.update();
	}
	
	public void registerObserver(Observer observador) {
		alarmes.add(observador);
	}
	
	public void removeObserver(Observer observador) {
		alarmes.remove(observador);
	}
}
