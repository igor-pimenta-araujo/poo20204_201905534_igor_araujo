package aula09.as7b.exercicio04.situacao01;

public class TestaLivro {

	public static void main(String[] args) {
		Editora editora = new Editora("Abril", "6543.3215-23");
		Livro livro = new Livro("Superligdo", 2014, editora);
		
		System.out.println(livro);
	}
}
