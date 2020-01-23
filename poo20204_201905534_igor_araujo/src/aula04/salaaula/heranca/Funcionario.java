package aula04.salaaula.heranca;

public class Funcionario extends PessoaFisica {
	int matricula;
	double salario;
	String cargo;
	
	public Funcionario() {}

	public Funcionario(String nome, String endereco, String telefone, String cpf, String sexo, String estadoCivil,
			int matricula, double salario, String cargo) {
		super(nome, endereco, telefone, cpf, sexo, estadoCivil);
		this.matricula = matricula;
		this.salario = salario;
		this.cargo = cargo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("Matricula do Funcionario: " + this.getMatricula());
		sb.append("Salario do Funcionario: " + this.getSalario());
		sb.append("Cargo do Funcionario: " + this.getCargo());
		return sb.toString();
	}
}
