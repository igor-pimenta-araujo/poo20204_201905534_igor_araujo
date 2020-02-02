package aula09.as7b.exercicio04;

public class Livro extends Produto {

	private Editora editora;

	public Livro(String tipo, String nome, double preco, Editora editora) {
		super(tipo, nome, preco);
		this.editora = editora;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

}
