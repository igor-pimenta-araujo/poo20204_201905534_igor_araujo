package aula10.as8b.exercicio05;

public class EnsinoBasico extends SemEscolaridade {
	private String escola;

	public EnsinoBasico(String nome, int codigoFuncional, String escola, String tipoComissao) {
		super(nome, codigoFuncional, tipoComissao);
		super.acrescimo(1.1);
		this.escola = escola;
		
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}	
}
