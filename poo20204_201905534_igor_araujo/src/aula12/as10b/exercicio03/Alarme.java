package aula12.as10b.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Alarme extends Observable implements Observer {
	private List<Observer> observers = new ArrayList<Observer>();
	Policia p = new Policia();
	Seguradora s = new Seguradora();

	@Override
	public void update(Observable o, Object arg) {

	}

	public void update() {
		System.out.println("Alarme acionado....\n....Notificando Policia e Companhia de Seguros:");
		p.update();
		s.update();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void testa() {}


}
