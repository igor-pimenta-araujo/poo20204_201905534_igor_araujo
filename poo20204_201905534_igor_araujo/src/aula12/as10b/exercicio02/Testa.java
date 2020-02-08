package aula12.as10b.exercicio02;

public abstract class Testa {

	public static void main(String[] args) {
		Pasta principal = new Pasta("Principal");
		Pasta secundaria = new Pasta("Secundaria");
		
		principal.adicionaComponente(secundaria);
		
	}

}
