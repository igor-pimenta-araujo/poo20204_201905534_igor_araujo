package aula04.as4b.exercicio01.contexto.alunos;

public class Departamento {
	private String nome;
	private String sigla;
	
	public Departamento(String nome, String sigla) {
		super();
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nDados do departamento:");
		sb.append("\nNome do departamento: " + this.getNome());
		sb.append("\nSigla do departamento: " + this.getSigla());
		return sb.toString();
	}
}
