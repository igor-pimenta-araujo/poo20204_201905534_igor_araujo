package aula04.as4b.exercicio03;

public class Pessoa {
	private String nome;
	private String telefone;

	public Pessoa(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nNome: " + this.getNome());
		sb.append("\nTelefone: " + this.getTelefone());
		return sb.toString();
	}
}
