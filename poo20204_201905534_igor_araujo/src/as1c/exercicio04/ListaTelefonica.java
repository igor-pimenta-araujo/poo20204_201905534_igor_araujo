/*
 * Exercicio: 4
 * */

package as1c.exercicio04;

import java.util.Scanner;

public class ListaTelefonica {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = null, numero = null;
		int check = 0, digito = 0, letra = 0;
		
		System.out.println("Digite o nome (Apenas letras)");
		
		while(check == 0) {
			nome = sc.nextLine();
			
			for (int i = 0; i < nome.length(); i++) {
				char c = nome.charAt(i);
				if(Character.isDigit(c)) {
					digito = 1;
				}
			}
			
			if(digito == 0) {
				check = 1;
			}else {
				System.out.println("Digite o nome novamente (Apenas letras)");
				digito = 0;
			}
			
		}
		
		check = 0;
		
		System.out.println("Digite o numero(Apenas numeros)");
		
		while(check == 0) {
			numero = sc.nextLine();
			
			for(int i = 0; i < numero.length(); i++) {
				char c = numero.charAt(i);
				if(Character.isLetter(c)) {
					letra = 1;
				}
			}
			
			if(letra == 0) {
				check = 1;
			}else {
				System.out.println("Digite o numero novamente(Apenas numeros)");
				letra = 0;
			}
		}
		
		System.out.println("Nome e numero validados");
		System.out.println("Nome: " + nome + "\nNumero: " + numero);

	}

}
