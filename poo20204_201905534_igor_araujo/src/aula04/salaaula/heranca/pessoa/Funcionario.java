package aula04.salaaula.heranca.pessoa;

public class Funcionario {
	private String nome;
	private double salario;
	private String cpf;
	
	public Funcionario() {}

	public Funcionario(String n, double s, String c) {
		this.cpf = c;
		this.salario = s;
		this.nome = n;
	}

	public double calculaBonificacao() {
		return this.salario *= 1.1;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String c) {
		this.cpf = c;
	}
}
