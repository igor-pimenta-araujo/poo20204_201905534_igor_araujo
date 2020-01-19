/*
 * Exercicio: 4
*/

package as1b;

import java.util.Scanner;

public class CreditoBanco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double saldoMedio, credito = 0;
		int caso;
		System.out.println("Digite o saldo medio: ");
		saldoMedio = Integer.parseInt(sc.nextLine());
		if(saldoMedio < 201) {
			caso = 0;
		}else if(saldoMedio < 401) {
			caso = 1;
		}else if(saldoMedio < 601) {
			caso = 2;
		}else {
			caso = 3;
		}
		
		switch(caso) {
		case 0:
			credito = saldoMedio*0;
			break;
		case 1:
			credito = saldoMedio*0.2;
			break;
		case 2:
			credito = saldoMedio*0.3;
			break;
		case 3:
			credito = saldoMedio*0.4;
			break;
		}
		
		System.out.println("O valor do crédito será: R$" + credito + "0");
		
	}

}
