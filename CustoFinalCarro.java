/*
 * Exercicio: 2
 * */

package as1b;

import java.util.Scanner;

public class CustoFinalCarro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double custoFabrica, valorFinal;
		System.out.println("Qual o custo de fabrica do carro?");
		custoFabrica = Integer.parseInt(sc.nextLine());
		valorFinal = (custoFabrica*1.45)*1.28;
		System.out.println("O custo do carro novo ao consumidor é: " + valorFinal);
	}

}
