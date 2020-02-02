/*
 * Exercicio 1.2
 * */

package aula09.as7b.exercicio01.cominterface;

public class Veiculo implements Modelo {

	private int placa;
	Empregado responsavel;

	public Veiculo(int placa, Empregado responsavel) {
		this.setPlaca(placa);
		this.responsavel = responsavel;
	}

	public Empregado getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(Empregado responsavel) {
		this.responsavel = responsavel;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	@Override
	public void imprimir() {

	}

	@Override
	public String toString() {
		return toString();
	}

}
