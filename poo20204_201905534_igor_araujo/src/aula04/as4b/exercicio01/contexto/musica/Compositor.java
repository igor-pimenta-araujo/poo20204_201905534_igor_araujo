package aula04.as4b.exercicio01.contexto.musica;

public class Compositor {
	private String nome;
	private String nacionalidade;

	public Compositor(String nome, String nacionalidade) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nDados do compositor da musica:");
		sb.append("\nNome do compositor: " + this.getNome());
		sb.append("\nNacionalidade do compositor: " + this.getNacionalidade());
		return sb.toString();
	}
}
