/*
 * Exercicio 03
*/

package aula10.as8b.exercicio03;

import aula10.as8b.exercicio01.Animal;
import aula10.as8b.exercicio01.Cachorro;
import aula10.as8b.exercicio01.Cavalo;
import aula10.as8b.exercicio01.Preguica;

public class TestaVeterinario {

	public static void main(String[] args) {
		Animal reino[] = new Animal[3];		
		Veterinario v = new Veterinario();
		
		reino[0] = new Cachorro("Jorge", 3);
		reino[1] = new Cavalo("Carpeado", 2);
		reino[2] = new Preguica("Gilberto", 4);
		
		for(Animal a : reino) {
			v.examinar(a);
		}
	}

}
