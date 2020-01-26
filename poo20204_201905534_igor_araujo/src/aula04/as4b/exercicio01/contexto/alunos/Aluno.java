package aula04.as4b.exercicio01.contexto.alunos;

public class Aluno {
	private String nome;
	private int matricula;
	private int ano;
	private Curso curso;
	
	public Aluno(String nome, int matricula, int ano, Curso curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.ano = ano;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}	
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nDados do aluno:");
		sb.append("\nNome do aluno: " + this.getNome());
		sb.append("\nAno do aluno: " + this.getAno());
		sb.append("\nMatricula do aluno: " + this.getMatricula());
		sb.append(this.getCurso());
		return sb.toString();
	}
}
