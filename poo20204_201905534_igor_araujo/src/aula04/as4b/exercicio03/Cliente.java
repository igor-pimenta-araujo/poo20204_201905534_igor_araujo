package aula04.as4b.exercicio03;

public class Cliente extends Pessoa{
	private int idade;
	private String cpf;
	private String status;

	public Cliente(String nome, String telefone, int idade, String cpf) {
		super(nome, telefone);
		this.idade = idade;
		this.cpf = cpf;
		this.status = "A";
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void desativar() {
		if(getStatus() == "A") {
			setStatus("I");
			System.out.println("\nO cliente agora está desativado");
		}else {
			System.out.println("O cliente já está desativado");
		}
	}

	public void dadosCliente() {
		System.out.println("\nDados do cliente: ");
		System.out.print(getNome() + " - Tel: " + getTelefone() + " - idade: " + getIdade()  + " - CPF: " + getCpf() + " - Status: ");
		if(getStatus() == "A") {
			System.out.println("Ativo");
		}else {
			System.out.println("Inativo");
		}
	}
}
