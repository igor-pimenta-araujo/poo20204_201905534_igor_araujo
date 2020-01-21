package aula03.salaaula;

import java.util.Date;

public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Jorley");
		p1.setDataNascimento(new Date());
		
		System.out.println("Nome: "+ p1.getNome());
		System.out.println("Data de nascimento: " + p1.getDataNascimento());
		System.out.println("Especie: " + p1.especie);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Alberto");
		System.out.println("Dados da pessoa 2: ");
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Especie: " + p2.especie);
	}

}