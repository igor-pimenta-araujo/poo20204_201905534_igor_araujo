/*
 * Exercicio 1
 * */

package as1c;

import java.util.Scanner;

public class Alunos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qntdAlunos = 0;
		
		System.out.println("Digite a quantidade de alunos: ");
		qntdAlunos = Integer.parseInt(sc.nextLine());
		
		String lista = "", str;
		for(int i = 0; i < qntdAlunos; i++) {
			System.out.println("Qual a matricula do aluno?");
			str = sc.nextLine();
			lista = lista + str + " - ";
			System.out.println("Qual o nome do aluno?");
			str = sc.nextLine();
			lista = lista + str + "\n";
		}
		System.out.println("Lista de Alunos: ");
			System.out.print(lista);
	}
}
