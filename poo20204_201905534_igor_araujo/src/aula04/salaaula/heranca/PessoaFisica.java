package aula04.salaaula.heranca;

public class PessoaFisica extends Pessoa {
	String cpf;
	String sexo;
	String estadoCivil;

	public PessoaFisica() {}

	public PessoaFisica(String nome, String endereco, String telefone, String cpf, String estadoCivil, String sexo) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nCPF da pessoa fisica: " + this.getCpf());
		sb.append("\nEstado civil da pessoa fisica: " + this.getEstadoCivil());
		sb.append("\nSexo da pessoa fisica: " + this.getSexo());
		return sb.toString();
	}

}
