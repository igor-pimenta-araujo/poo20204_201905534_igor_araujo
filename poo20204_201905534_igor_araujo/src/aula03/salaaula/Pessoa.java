package aula03.salaaula;

import java.util.Date;

public class Pessoa {
	//Atributos
	private String nome;
	private Date dataNascimento;
	public final String especie = "mamifero";
	
	
	//Metodos
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setDataNascimento(Date dn) {
		this.dataNascimento = dn;
	}
}