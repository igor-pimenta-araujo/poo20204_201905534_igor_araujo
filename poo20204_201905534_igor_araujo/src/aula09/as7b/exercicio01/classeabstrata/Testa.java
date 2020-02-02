package aula09.as7b.exercicio01.classeabstrata;

public class Testa {

	public static void main(String[] args) {
		
		//1.3 –  Criar um veículo com seu responsável usando os construtores
		Empregado e = new Empregado("Astra", "152634", "Igor", 19);
		Veiculo v = new Veiculo("Astra", 154245, e);
		
		
		// 1.4 – usar os métodos sets para alterar os dados dos objetos
		v.setPlaca(98657485);
		v.responsavel.setIdade(25);
		
		
		//1.6 –  usar os métodos toString e imprimir.		
		v.imprimir();
		System.out.println(v);
	}

}
