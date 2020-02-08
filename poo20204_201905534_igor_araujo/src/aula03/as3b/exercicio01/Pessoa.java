/*
 * Exercicio 01
 * */

package aula03.as3b.exercicio01;

public class Pessoa {
	private String nome;
	private float altura;
	private int idade;

	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	
	public Pessoa() {}
	
	
	public Pessoa(String nome, float altura, int diaNascimento, int mesNascimento, int anoNascimento) {
		this.nome = nome;
		this.altura = altura;
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

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int calculaIdade() {
		int diasVividos;
		diasVividos = ((25 - diaNascimento) + ((1 - mesNascimento) * 30) + ((2020 - anoNascimento) * 365));
		setIdade(diasVividos/365);
		return this.getIdade();
	}

	public void dadosPessoais() {
		System.out.println("\nDados da pessoa:");
		System.out.println("\nNome da pessoa:" + getNome());
		System.out.println("\nAltura da pessoa:" + getAltura() + "cm");
		System.out.println("\nIdade da pessoa:" + calculaIdade());
	}

}
