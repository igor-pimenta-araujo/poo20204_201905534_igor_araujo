package aula09.as7b.exercicio03;

import aula09.as7b.exercicio02.ObraArte;

public class Venda {

	private int diaVenda;
	private int mesVenda;
	private int anoVenda;
	private Cliente cliente;
	private ObraArte obraVendida;

	public Venda(Cliente cliente, ObraArte obraVendida, int diaVenda, int mesVenda, int anoVenda) {
		this.diaVenda = diaVenda;
		this.mesVenda = mesVenda;
		this.anoVenda = anoVenda;
		this.cliente = cliente;
		this.obraVendida = obraVendida;
	}

	public int getDiaVenda() {
		return diaVenda;
	}

	public void setDiaVenda(int diaVenda) {
		this.diaVenda = diaVenda;
	}

	public int getMesVenda() {
		return mesVenda;
	}

	public void setMesVenda(int mesVenda) {
		this.mesVenda = mesVenda;
	}

	public int getAnoVenda() {
		return anoVenda;
	}

	public void setAnoVenda(int anoVenda) {
		this.anoVenda = anoVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ObraArte getObraVendida() {
		return obraVendida;
	}

	public void setObraVendida(ObraArte obraVendida) {
		this.obraVendida = obraVendida;
	}

	@Override
	public String toString() {
		return "\nVenda:\nData da venda: " + diaVenda + "/" + mesVenda + "/" + anoVenda
				+ cliente + "\n" + obraVendida;
	}
	
	
}
