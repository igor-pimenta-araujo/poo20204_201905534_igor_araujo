package aula04.as4b.exercicio03;

public class Gerente extends Funcionario {
	private double bonificacao;
	private String tipo;

	public Gerente(String nome, String telefone, int matricula, double salario, double bonificacao, String tipo) {
		super(nome, telefone, matricula, salario);
		this.bonificacao = bonificacao;
		this.tipo = tipo;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double recebimentoAnual() {
		double recebimentoAnual = 0;

		recebimentoAnual = (this.getSalario() + this.getBonificacao()) * 12;

		return recebimentoAnual;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nDados do gerente: ");
		sb.append("\nNome: " + this.getNome());
		sb.append("\nTelefone: " + this.getTelefone());
		sb.append("\nMatricula: " + this.getMatricula());
		sb.append("\nSalario: " + this.getSalario());
		sb.append("\nBonificação: " + this.getBonificacao());
		sb.append("\nTipo: " + this.getTipo());
		return sb.toString();
	}
	
}
