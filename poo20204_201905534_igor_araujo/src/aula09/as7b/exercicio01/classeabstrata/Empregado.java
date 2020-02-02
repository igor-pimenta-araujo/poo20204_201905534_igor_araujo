/*
 * Exercicio 1.1
 * */

package aula09.as7b.exercicio01.classeabstrata;

public class Empregado extends Modelo {
	private String codigo;
	private String nome;
	private int idade;

	public Empregado(String tituloProjeto, String codigo, String nome, int idade) {
		super(tituloProjeto);
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/*
	 * 1.5 – implementar os métodos toString e imprimir
	 * */
	public void imprimir() {
		System.out.println("\nDados do empregado: ");
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("idade: " + this.idade);
	}

	public String toString() {
		return "Empregado [codigo= " + codigo + ", nome= " + nome + ", idade= " + idade + "]";
	}

}
