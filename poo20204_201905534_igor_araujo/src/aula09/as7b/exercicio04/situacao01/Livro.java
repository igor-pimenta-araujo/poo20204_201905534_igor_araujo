package aula09.as7b.exercicio04.situacao01;

public class Livro {
	private String titulo;
	private int anoPublicacao;
	private Editora editora;

	public Livro(String titulo, int anoPublicacao, Editora editora) {
		super();
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Livro: \nTitulo: " + titulo + "\nAno de Publicacao: " + anoPublicacao + 	editora;
	}
	

}
