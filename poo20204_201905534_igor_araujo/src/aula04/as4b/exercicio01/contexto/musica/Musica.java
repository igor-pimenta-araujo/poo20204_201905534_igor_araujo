package aula04.as4b.exercicio01.contexto.musica;

public class Musica{
	private String nome;
	private int ano;
	private String tipo;
	private Compositor compositor;

	public Musica(String nome, int ano, String tipo, Compositor compositor) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.tipo = tipo;
		this.compositor = compositor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Compositor getCompositor() {
		return compositor;
	}

	public void setCompositor(Compositor compositor) {
		this.compositor = compositor;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nDados da musica:");
		sb.append("\nNome da musica: " + this.getNome());
		sb.append("\nTipo da musica: " + this.getTipo());
		sb.append("\nAno da musica: " + this.getAno());
		sb.append(compositor);
		return sb.toString();
	}
}
