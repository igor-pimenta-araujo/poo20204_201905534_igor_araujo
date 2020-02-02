package aula09.as7b.exercicio04.situacao03;

public class Revista {
	private String nome;
	private int edicao;
	private int ano;
	
	public Revista(String nome, int edicao, int ano) {
		super();
		this.nome = nome;
		this.edicao = edicao;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Dados da Revista \nNome: " + nome + "\nEdicao: " + edicao + "\nAno: " + ano + "\n";
	}
	
	
}
