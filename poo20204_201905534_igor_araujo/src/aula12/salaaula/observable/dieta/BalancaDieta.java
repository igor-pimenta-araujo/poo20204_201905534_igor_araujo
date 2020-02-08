package aula12.salaaula.observable.dieta;

import java.util.Observable;
import java.util.Observer;

public class BalancaDieta implements Observer {

	public void update(double peso) {
		if (peso >= 100) {
			System.out.println("Você ultrapassou o peso limite no sistema!");
		}
	}

	@Override
	public void update(Observable o, Object arg) {

	}

}
