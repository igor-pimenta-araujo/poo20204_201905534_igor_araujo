package aula10.as8b.exercicio05;

public class Graduacao extends EnsinoMedio {
	private String universidade;

	public Graduacao(String nome, int codigoFuncional, String escola, String escolaMedio, String universidade, String tipoComissao) {
		super(nome, codigoFuncional, escola, escolaMedio, tipoComissao);
		super.acrescimo(2);
		this.universidade = universidade;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
	
	
}
