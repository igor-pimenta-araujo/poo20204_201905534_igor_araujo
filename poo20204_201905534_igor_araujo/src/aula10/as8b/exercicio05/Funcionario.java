package aula10.as8b.exercicio05;

public abstract class Funcionario {
	private String nome;
	private int codigoFuncional;
	private double salario;

	public Funcionario(String nome, int codigoFuncional, double salario) {
		super();
		this.nome = nome;
		this.codigoFuncional = codigoFuncional;
		this.salario = 1000;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(int codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
