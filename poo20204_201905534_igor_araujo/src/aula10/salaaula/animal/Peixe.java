package aula10.salaaula.animal;

public class Peixe extends Animal {

	public Peixe(String nome) {
		super(nome);
	}
	
	public void mover(int x, int y) {
		System.out.println("Nado do peixe");
	}
	
	public void nadar() {
		System.out.println("Sou um " + this.getClass().getSimpleName() + " e estou nadando");
	}
	
}
