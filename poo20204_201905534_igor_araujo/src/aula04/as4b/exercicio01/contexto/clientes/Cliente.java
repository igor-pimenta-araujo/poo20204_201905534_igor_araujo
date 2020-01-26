package aula04.as4b.exercicio01.contexto.clientes;

public class Cliente {
	private String nome;
	private String cpf;
	Endereco endereco;

	public Cliente(String nome, String cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nDados do Cliente:");
		sb.append("\nNome: " + this.nome);
		sb.append("\nCPF: " + this.cpf);
		sb.append(endereco);
		return sb.toString();
	}
	
	
}
