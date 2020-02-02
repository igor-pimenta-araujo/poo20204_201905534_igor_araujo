package aula10.as8b.exercicio05;

public class EnsinoBasico extends Funcionario {
	private String escola;

	public EnsinoBasico(String nome, int codigoFuncional, double salario, String escola) {
		super(nome, codigoFuncional, salario);
		this.escola = escola;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

}
