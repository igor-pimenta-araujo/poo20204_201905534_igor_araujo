package aula09.as7b.exercicio02;

public class Artista {
	private String nome;
	private String localNascimento;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;

	public Artista(String nome, String localNascimento, int diaNascimento, int mesNascimento, int anoNascimento) {
		super();
		this.nome = nome;
		this.localNascimento = localNascimento;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalNascimento() {
		return localNascimento;
	}

	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}

	public int getDiaNascimento() {
		return diaNascimento;
	}

	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	@Override
	public String toString() {
		return "Artista:\nNome: " + nome + "\nLocal de nascimento: " + localNascimento + "\nData nascimento: " + diaNascimento
				+ "/" + mesNascimento + "/" + anoNascimento;
	}
	
}
