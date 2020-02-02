/*
 * Exercicio 01
 * */

package aula10.as8b.exercicio01;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("O cavalo está emitindo som");
	}
	
	public void correr() {
		System.out.println("O cavalo está correndo");
	}
}
