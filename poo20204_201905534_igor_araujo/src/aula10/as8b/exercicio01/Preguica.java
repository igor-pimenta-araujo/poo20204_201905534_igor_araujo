/*
 * Exercicio 01
 * */

package aula10.as8b.exercicio01;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("A pregui�a est� emitindo som");
	}
	
	public void subirArvore() {
		System.out.println("A pregui�a est� subindo a �rvore");
	}
}
