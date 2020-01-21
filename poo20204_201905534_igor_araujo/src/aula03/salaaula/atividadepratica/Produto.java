package aula03.salaaula.atividadepratica;

public class Produto {
	private String nome;
	private String tipo;
	private String cor;
	private String especificacao;
	private int tamanho;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nCor: " + this.cor + "\nTipo: " + this.tipo + "\nEspecificacoes: " + this.especificacao+ "\nTamanho: " + this.tamanho;
	}

}
