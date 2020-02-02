package aula10.as8b.exercicio05;

public class EnsinoMedio extends EnsinoBasico{
	private String escola;

	public EnsinoMedio(String nome, int codigoFuncional, String escola, String escolaMedio, String tipoComissao) {
		super(nome, codigoFuncional, escola, tipoComissao);
		super.acrescimo(1.5);
		this.escola = escolaMedio;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

}
