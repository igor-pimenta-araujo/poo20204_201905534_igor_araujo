package aula04.salaaula.heranca;

public class Cliente extends PessoaFisica{
	double renda;
	String profissao;
	String interesses;
	
	public Cliente(String nome, String endereco, String telefone, String cpf, String sexo, String estadoCivil, double renda, String profissao, String interesses){
		super(nome, endereco, telefone, cpf, sexo, estadoCivil);
		this.renda = renda;
		this.profissao = profissao;
		this.interesses = interesses;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String getInteresses() {
		return interesses;
	}

	public void setInteresses(String interesses) {
		this.interesses = interesses;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("Renda do Cliente: " + this.getRenda());
		sb.append("Profissao do Cliente: " + this.getProfissao());
		sb.append("Interesses do Cliente: " + this.getInteresses());
		return sb.toString();
	}
}
