package aula10.as8b.exercicio05;

public class SemEscolaridade extends Funcionario {
	private String tipoComissao;

	public SemEscolaridade(String nome, int codigoFuncional, String tipoComissao) {
		super(nome, codigoFuncional);
		super.acrescimo(1);
		this.tipoComissao = tipoComissao;
		if(this.tipoComissao == "Gerente") {
			super.setComissao(1500);
		}
		if(this.tipoComissao == "Supervisor") {
			super.setComissao(600);
		}
		if(this.tipoComissao == "Vendedor") {
			super.setComissao(250);
		}
		
	}

	public String getTipoComissao() {
		return tipoComissao;
	}

	public void setTipoComissao(String tipoComissao) {
		this.tipoComissao = tipoComissao;
	}
	
	
}
