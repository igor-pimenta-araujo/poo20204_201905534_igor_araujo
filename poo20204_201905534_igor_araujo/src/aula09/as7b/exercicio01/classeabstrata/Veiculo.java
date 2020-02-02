/*
 * Exercicio 1.1
 * */

package aula09.as7b.exercicio01.classeabstrata;

public class Veiculo extends Modelo {
	private int placa;
	Empregado responsavel;
	
	public Veiculo(String tituloProjeto, int placa, Empregado responsavel) {
		super(tituloProjeto);
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
	
	
	/*
	 * 1.5 – implementar os métodos toString e imprimir
	 * */
	
	public void imprimir() {
		System.out.println("\nDados do Veiculo: ");
		System.out.println("Placa: " + this.placa);
		System.out.println("Dados do Responsavel: ");
		System.out.println("Codigo: " + responsavel.getCodigo());
		System.out.println("Nome: " + responsavel.getNome());
		System.out.println("idade: " + responsavel.getIdade());
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", responsavel= " + responsavel + "]";
	}
	

}
