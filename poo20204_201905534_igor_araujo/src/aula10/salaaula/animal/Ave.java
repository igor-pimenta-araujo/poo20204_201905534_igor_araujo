package aula10.salaaula.animal;

public class Ave extends Animal{

	public Ave(String nome) {
		super(nome);
	}
	
	public void mover(int x, int y) {
		System.out.println("Movimento da ave");
	}
	
}
