package aula12.as10b.exercicio02;

public class Arquivo extends Componente{
	private double tamanho;

	public Arquivo(String nome, double tamanho) {
		super(nome);
		this.tamanho = tamanho;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	

}
