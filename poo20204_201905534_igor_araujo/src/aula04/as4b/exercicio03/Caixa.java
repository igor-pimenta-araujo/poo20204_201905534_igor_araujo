package aula04.as4b.exercicio03;

public class Caixa extends Funcionario {
	private String horario;
	
	public Caixa(String nome, String telefone, int matricula, double salario, String horario) {
		super(nome, telefone, matricula, salario);
		this.horario = horario;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double recebimentoAnual() {
		double recebimentoAnual = 0;
		
		recebimentoAnual = this.getSalario()*12;
		
		return recebimentoAnual;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nDados do caixa: ");
		sb.append("\nNome: " + this.getNome());
		sb.append("\nTelefone: " + this.getTelefone());
		sb.append("\nMatricula: " + this.getMatricula());
		sb.append("\nSalario: " + this.getSalario());
		sb.append("\nHorario: " + this.getHorario());
		return sb.toString();
	}
}
