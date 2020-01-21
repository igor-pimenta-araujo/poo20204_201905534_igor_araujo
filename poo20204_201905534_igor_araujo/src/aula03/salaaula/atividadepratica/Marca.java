package aula03.salaaula.atividadepratica;

public class Marca {
	private String nome;
	private int cnpj;
	private String nomeContato;
	private int telefoneContato;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public int getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(int telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\ncnpj: " + this.cnpj + "\nNome do responsavel: " + this.nomeContato + "\nTelefone de contato: " + this.telefoneContato;
	}
}
