package aula04.salaaula.heranca.pessoa;

public class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, double salario) {
		super(nome, salario, cpf);
	}

	public Gerente() {}

	@Override
	public double calculaBonificacao() {
		double salario = this.getSalario();
		return salario *= 1.15;
	}
}
