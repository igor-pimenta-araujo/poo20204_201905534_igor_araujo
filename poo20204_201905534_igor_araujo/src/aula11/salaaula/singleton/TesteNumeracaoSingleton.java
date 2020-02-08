package aula11.salaaula.singleton;

public class TesteNumeracaoSingleton {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			NumeracaoSingleton num = NumeracaoSingleton.getInstancia();
			System.out.println(num);
		}
	}

} 
