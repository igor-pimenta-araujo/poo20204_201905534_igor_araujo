package aula12.as10b.exercicio02;

public class Componente {
	private String nome;

	public Componente(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void printNomeArquivo() {
		System.out.println("Nome do arquivo: " + this.nome);
	}
}
