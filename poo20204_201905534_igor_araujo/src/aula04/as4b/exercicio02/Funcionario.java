package aula04.as4b.exercicio02;

import java.text.DecimalFormat;

public class Funcionario {
	private String nome;
	private String cargo;
	private String departamento;
	private int matricula;
	private String cpf;
	private Endereco endereco;
	private double salario;
	
	public Funcionario() {}

	public Funcionario(String nome, String cargo, String departamento, int matricula, String cpf,
			double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.departamento = departamento;
		this.matricula = matricula;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentaSalario(double percentual) {
		this.salario *= (percentual/100)+1;
	}
	
	DecimalFormat df = new DecimalFormat("0.00");

	public void dadosFuncionario() {
		System.out.print("\n" + this.getMatricula());
		System.out.print(" - " + this.getCpf());
		System.out.print(" - " + this.getNome());
		System.out.print(" - Departamento: " + this.getDepartamento());
		System.out.print(" - Cargo: " + this.getCargo());
		System.out.print(" - Salario: R$" + df.format(this.getSalario()));
	}
}
