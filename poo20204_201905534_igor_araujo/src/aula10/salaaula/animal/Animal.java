package aula10.salaaula.animal;

public class Animal {
	private String nome;
	private int coordenadaX;
	private int coordenadaY;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public Animal() {
		this.nome = "Anonimo";
	}
	
	protected void setCoordenadas(int x, int y) {
		coordenadaX = x;
		coordenadaY = y;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public void mover(int x, int y) {
		System.out.println("Não sei me mover");
	}
}
