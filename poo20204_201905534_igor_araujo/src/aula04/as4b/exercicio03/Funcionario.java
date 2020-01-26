package aula04.as4b.exercicio03;

public class Funcionario extends Pessoa{
	private int matricula;
	private double salario;

	public Funcionario(String nome, String telefone, int matricula, double salario) {
		super(nome, telefone);
		this.matricula = matricula;
		this.salario = salario;
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
	
	public void aumentaSalario(double percentual) {
		setSalario(((percentual/100)+1)*getSalario());
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nMatricula: " + this.getMatricula());
		sb.append("\nSalario: " + this.getSalario());
		return sb.toString();
	}
}
