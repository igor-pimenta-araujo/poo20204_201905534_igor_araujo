package aula12.as10b.exercicio02;

public abstract class Testa {

	public static void main(String[] args) {
		Pasta principal = new Pasta("Principal");
		Pasta secundaria = new Pasta("Secundaria");
		Arquivo a = new Arquivo("AS10", 415.23);
		
		principal.adicionaPasta(secundaria);
		secundaria.adicionaArquivo(a);
		
		
		principal.mostrarPastas();
		principal.mostrarArquivos();
		secundaria.mostrarPastas();
		secundaria.mostrarArquivos();
		
		
	}
}
