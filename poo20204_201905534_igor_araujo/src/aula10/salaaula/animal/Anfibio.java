package aula10.salaaula.animal;

public class Anfibio extends Animal {

	public Anfibio(String nome) {
		super(nome);
	}
	
	public void mover(int x, int y) {
		System.out.println("Movimento do anfibio");
	}
}
