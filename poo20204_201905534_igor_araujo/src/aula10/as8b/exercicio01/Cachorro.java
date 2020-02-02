/*
 * Exercicio 01
 * */

package aula10.as8b.exercicio01;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("O cachorro está emitindo som: AuAu");
	}

	public void correr() {
		System.out.println("O cachorro está correndo");
	}
}
