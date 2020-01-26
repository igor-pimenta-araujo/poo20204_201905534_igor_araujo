package aula06.salaaula.endereco;

import java.util.ArrayList;

public class Municipio {
	private Long codigoIBGE;
	private String nome;
	private Estado estado;
	private ArrayList<Bairro> bairros;

	public Municipio(Long codigoIBGE, String nome, Estado estado) {
		super();
		this.codigoIBGE = codigoIBGE;
		this.nome = nome;
		this.estado = estado;
		this.bairros = new ArrayList<Bairro>();
	}

	public ArrayList<Bairro> getBairros() {
		return bairros;
	}

	public void setBairros(ArrayList<Bairro> bairros) {
		this.bairros = bairros;
	}

	public Long getCodigoIBGE() {
		return codigoIBGE;
	}

	public void setCodigoIBGE(Long codigoIBGE) {
		this.codigoIBGE = codigoIBGE;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
