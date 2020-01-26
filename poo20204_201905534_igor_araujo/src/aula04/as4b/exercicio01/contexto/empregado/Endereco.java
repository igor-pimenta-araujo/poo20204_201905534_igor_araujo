package aula04.as4b.exercicio01.contexto.empregado;

public class Endereco {
	private String rua;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private int numero;
	private int cep;

	public Endereco(String rua, String complemento, String bairro, String cidade, String estado, int numero, int cep) {
		super();
		this.rua = rua;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nDados do endereço:");
		sb.append("\nCEP: " + this.cep);
		sb.append("\nRua: " + this.rua);
		sb.append("\nNumero: " + this.numero);
		sb.append("\nComplemento: " + this.complemento);
		sb.append("\nBairro: " + this.bairro);
		sb.append("\nCidade: " + this.cidade);
		sb.append("\nEstado: " + this.estado);
		return sb.toString();
	}
}
