package aula10.as8b.exercicio05;

public class Graduacao extends EnsinoMedio {
	private String Universidade;

	public Graduacao(String nome, int codigoFuncional, double salario, String escola, String universidade) {
		super(nome, codigoFuncional, salario*1.5, escola);
		Universidade = universidade;
	}

	public String getUniversidade() {
		return Universidade;
	}

	public void setUniversidade(String universidade) {
		Universidade = universidade;
	}
	
	
}
