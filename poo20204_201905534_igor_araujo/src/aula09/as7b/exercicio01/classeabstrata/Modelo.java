/*
 * Exercicio 1.1
 * */

package aula09.as7b.exercicio01.classeabstrata;

public abstract class Modelo {
	private String tituloProjeto;

	public Modelo(String tituloProjeto) {
		super();
		this.tituloProjeto = tituloProjeto;
	}

	public String getTituloProjeto() {
		return tituloProjeto;
	}

	public void setTituloProjeto(String tituloProjeto) {
		this.tituloProjeto = tituloProjeto;
	}
	
	public abstract void imprimir();

	public String toString() {
		return "Modelo [tituloProjeto=" + tituloProjeto + "]";
	}	
	
}
