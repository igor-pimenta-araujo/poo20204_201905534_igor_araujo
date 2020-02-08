package aula12.as10b.exercicio03;

import java.util.Observable;
import java.util.Observer;

public class Policia implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		
	}
	
	public void update() {
		System.out.println("--- Policia notificada ---");
	}
	
}
