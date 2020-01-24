package aula06.salaaula.endereco;

public class Endereco {
	private String numero;
	private String complemento;
	private int cep;
	private String tipo;
	private Bairro bairro;
	private Logradouro logradouro;

	public Endereco(String numero, String complemento, int cep, String tipo, Bairro bairro, Logradouro logradouro) {
		super();
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.tipo = tipo;
		this.bairro = bairro;
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Logradouro getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Imprimindo os dados do endereço:");
		sb.append("\nTipo do endereço: " + this.getTipo());
		sb.append("\n" + this.getLogradouro().getTipo().toString());
		sb.append("\n" + this.getLogradouro().getNome());
		sb.append("\n" + getNumero());
		sb.append("\n" + this.getComplemento());
		sb.append("\n" + this.getCep());
		sb.append("\n" + this.getBairro().getNome());
		sb.append("\n" + this.getBairro().getMunicipio().getNome());
		sb.append("\n" + this.getBairro().getMunicipio().getEstado().getNome());
		sb.append("\n" +  this.getBairro().getMunicipio().getEstado().getPais().getNome());
		return sb.toString();
	}

}
