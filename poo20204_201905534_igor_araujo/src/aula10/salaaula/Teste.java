package aula10.salaaula;

import aula10.salaaula.animal.Anfibio;
import aula10.salaaula.animal.Animal;
import aula10.salaaula.animal.Ave;
import aula10.salaaula.animal.Peixe;

public class Teste {

	public static void apresentar(Animal a) {
		System.out.println(a.getNome());
		a.mover(10, 10);

	}
	
	public static void main(String[] args) {
		
		Object[] lista = new Object[3];
		
		lista[0] = new Anfibio("Salamandra");
		lista[1] = new Ave("Quero-quero");
		lista[2] = new Peixe("Dourado");
		
		int tamVetor = lista.length;
		
		for (int i = 0; i < tamVetor; i++) {
			apresentar((Animal) lista[i]);
		}
	}

}
