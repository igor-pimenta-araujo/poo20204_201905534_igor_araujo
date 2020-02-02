package aula09.as7b.exercicio04;

public class Produto {

	private String tipo;
	private String nome;
	private double preco;

	public Produto(String tipo, String nome, double preco) {
		super();
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "----=----=----=----=----=----\nProduto: \nTipo: " + tipo + "\nNome: " + nome + "\nPreço: R$" + preco;
	}
}
