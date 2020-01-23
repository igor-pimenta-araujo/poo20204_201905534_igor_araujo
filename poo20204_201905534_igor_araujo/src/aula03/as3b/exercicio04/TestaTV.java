/*
 * Exercicio 4
 * */

package aula03.as3b.exercicio04;

import java.util.Scanner;

public class TestaTV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ControleRemoto cr = new ControleRemoto();
		int escolha = 0;

		while (escolha != 8) {
			System.out.println("\nO que deseja fazer?");
			System.out.println("1 - aumentar volume");
			System.out.println("2 - diminuir volume");
			System.out.println("3 - aumentar canal");
			System.out.println("4 - diminuir canal");
			System.out.println("5 - selecionar canal");
			System.out.println("6 - consultar volume");
			System.out.println("7 - consultar canal");
			System.out.println("8 - sair do menu de escolha");
			
			escolha = Integer.parseInt(sc.nextLine());

			switch (escolha) {
			case 1:
				cr.aumentaVolume();
				break;
			case 2:
				cr.diminuiVolume();
				break;
			case 3:
				cr.aumentaCanal();
				break;
			case 4:
				cr.diminuiCanal();
				break;
			case 5:
				int canalSelecionado;
				System.out.println("Qual canal deseja colocar?");
				canalSelecionado = Integer.parseInt(sc.nextLine());
				cr.selecionaCanal(canalSelecionado);
				break;
			case 6:
				cr.consultaVolume();
				break;
			case 7:
				cr.consultaCanal();
				break;
			case 8:
				System.out.println("Obrigado, sairá do menu de seleção nesse momento");
				break;

			default:
				System.out.println("Não há ação para esse numero");
				break;
			}
		}

	}

}
