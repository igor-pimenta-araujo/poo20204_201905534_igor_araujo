/*
 * Exercicio 04
*/

package aula10.as8b.exercicio04;

import aula10.as8b.exercicio01.Animal;
import aula10.as8b.exercicio01.Cachorro;
import aula10.as8b.exercicio01.Cavalo;
import aula10.as8b.exercicio01.Preguica;


public class Zoologico {

	public static void main(String[] args) {
		Animal[] jaula = new Animal[10];
		
		jaula[0] = new Cachorro("Jorge", 3);
		jaula[1] = new Cavalo("Carpeado", 2);
		jaula[2] = new Preguica("Gilberto", 4);
		jaula[3] = new Cachorro("Falcão", 3);
		jaula[4] = new Cavalo("Cristiano", 2);
		jaula[5] = new Preguica("Ale", 4);
		jaula[6] = new Cachorro("Zorro", 3);
		jaula[7] = new Cavalo("Pegasus", 2);
		jaula[8] = new Preguica("Gilberto", 4);
		jaula[9] = new Cachorro("Falcão", 3);
		
		for (int i = 0; i < 10; i++) {
			jaula[i].emitirSom();
			if(jaula[i] instanceof Cachorro) {
				((Cachorro) jaula[i]).correr();
			}else if(jaula[i] instanceof Cavalo){
				((Cavalo) jaula[i]).correr();
			}
			System.out.print("\n");
		}
		
	}

}
