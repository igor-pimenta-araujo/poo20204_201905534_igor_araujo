package aula10.as8b.exercicio05;

public abstract class Funcionario {
	private String nome;
	private int codigoFuncional;
	private double salario;
	private double comissao;

	public Funcionario(String nome, int codigoFuncional) {
		super();
		this.nome = nome;
		this.codigoFuncional = codigoFuncional;
		this.salario = 1000;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(int codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	// Exercicio 06
	protected void acrescimo(double porcentagem) {
		setSalario(getSalario() * porcentagem);
	}

	// Exercicio 11
	public String toString() {
		StringBuffer sb = new StringBuffer();
		System.out.println("\nDados do funcionario:");
		sb.append("Nome: " + this.getNome());
		sb.append("\nComissão: " + this.getComissao());
		sb.append("\nSalario total: " + (this.getSalario() + this.getComissao()));
		return sb.toString();
	}
	
}
