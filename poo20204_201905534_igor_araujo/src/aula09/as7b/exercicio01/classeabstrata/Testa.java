package aula09.as7b.exercicio01.classeabstrata;

public class Testa {

	public static void main(String[] args) {
		
		//1.3 �  Criar um ve�culo com seu respons�vel usando os construtores
		Empregado e = new Empregado("Astra", "152634", "Igor", 19);
		Veiculo v = new Veiculo("Astra", 154245, e);
		
		
		// 1.4 � usar os m�todos sets para alterar os dados dos objetos
		v.setPlaca(98657485);
		v.responsavel.setIdade(25);
		
		
		//1.6 �  usar os m�todos toString e imprimir.		
		v.imprimir();
		System.out.println(v);
	}

}
