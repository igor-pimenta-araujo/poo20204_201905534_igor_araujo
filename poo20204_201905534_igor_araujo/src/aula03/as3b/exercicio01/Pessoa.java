/*
 * Exercicio 01
 * */

/*
 * 1) Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
nascimento e altura. Crie os m�todos p�blicos necess�rios para sets e gets e tamb�m um
m�todo para imprimir todos dados de uma pessoa. Crie um m�todo para calcular a idade
da pessoa.
 * */

package aula03.as3b.exercicio01;

import java.util.Date;

public class Pessoa {
	private String nome;
	private int altura;
	private Date dataNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
