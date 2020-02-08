package aula13.salaaula.excecao;

public class TestaCalculadora {

	public static void main(String[] args) {
		int a = 2;
		int b = 0;

		Calculadora c = new Calculadora();

		try {
			System.out.println("O resultado da divisão de " + a + " com " + b + " é: " + c.dividir(a, b));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
