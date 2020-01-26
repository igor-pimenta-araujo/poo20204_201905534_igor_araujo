package aula04.as4b.exercicio01.contexto.empregado;

public class Empregado {
	private String nome;
	private String matricula;
	private Empresa empresa;
	
	public Empregado(String nome, String matricula, Empresa empresa) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.empresa = empresa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nDados do empregado:");
		sb.append("\nNome: " + this.getNome());
		sb.append("\nMatricula: " + this.getMatricula());
		sb.append(this.empresa);
		return sb.toString();
	}
	
	
}
