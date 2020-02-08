package aula13.salaaula.excecao;

public class Calculadora {
	
	/*public int dividir(int a, int b) {
		int result = 0;
		try {
			result = a/b;
		} catch (ArithmeticException e) {
			System.out.println("O segundo número deve ser diferente de 0");
		}
		return result;
	}*/
	
	public int dividir(int a, int b) throws ArithmeticException{
		return a/b;
	}
}
