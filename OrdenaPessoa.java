/*
 * Exercicio: 1
 * */

package as1b;

import java.util.Scanner;

class DadosPessoa {
	String nome;
	int idade;
}

public class OrdenaPessoa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DadosPessoa p1 = new DadosPessoa();
		DadosPessoa p2 = new DadosPessoa();
		DadosPessoa p3 = new DadosPessoa();
		
		//primeira pessoa
		System.out.println("Digite o nome da 1ª pessoa:");
		p1.nome = sc.nextLine();
		System.out.println("Digite a idade da 1ª pessoa:");
		p1.idade = Integer.parseInt(sc.nextLine());
		
		//segunda pessoa
		System.out.println("Digite o nome da 2ª pessoa:");
		p2.nome = sc.nextLine();
		System.out.println("Digite a idade da 2ª pessoa:");
		p2.idade = Integer.parseInt(sc.nextLine());
		
		//terceira pessoa
		System.out.println("Digite o nome da 3ª pessoa:");
		p3.nome = sc.nextLine();
		System.out.println("Digite a idade da 3ª pessoa:");
		p3.idade = Integer.parseInt(sc.nextLine());
		
		// Idade maior
		if(p1.idade > p2.idade) {
			if(p1.idade > p3.idade) {
				System.out.println("O nome da pessoa com a idade maior e: " +p1.nome);
			}else {
				System.out.println("O nome da pessoa com a idade maior e: " +p3.nome);
			}
		}else {
			if(p2.idade > p3.idade) {
				System.out.println("O nome da pessoa com a idade maior e: " +p2.nome);
			}else {
				System.out.println("O nome da pessoa com a idade maior e: " +p3.nome);
			}
		}
		
		// Idade menor
		if(p1.idade < p2.idade) {
			if(p1.idade < p3.idade) {
				System.out.println("O nome da pessoa com a idade menor e: " +p1.nome);
			}else {
				System.out.println("O nome da pessoa com a idade menor e: " +p3.nome);
			}
		}else {
			if(p2.idade < p3.idade) {
				System.out.println("O nome da pessoa com a idade menor e: " +p2.nome);
			}else {
				System.out.println("O nome da pessoa com a idade menor e: " +p3.nome);
			}
		}
	}

}
