package aula13.salaaula.excecao;

public class TestaCalculadora {

	public static void main(String[] args) {
		int a = 2;
		int b = 0;

		Calculadora c = new Calculadora();

		try {
			System.out.println("O resultado da divis�o de " + a + " com " + b + " �: " + c.dividir(a, b));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
