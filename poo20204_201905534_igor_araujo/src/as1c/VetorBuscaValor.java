/*
 * Exercicio 3
 * */

package as1c;

import java.util.Scanner;

public class VetorBuscaValor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tamanhoVetor, i, j, numeroBuscado, verif = 0, aux, posicao = 0;

		System.out.println("Qual o tamanho do vetor?");
		tamanhoVetor = Integer.parseInt(sc.nextLine());

		int v[] = new int[tamanhoVetor + 1], vOrdenado[] = new int[tamanhoVetor + 1];

		for (i = 0; i < tamanhoVetor; i++) {
			System.out.println("Qual o " + (i + 1) + "º numero");
			v[i] = Integer.parseInt(sc.nextLine());
			vOrdenado[i] = v[i];
		}

		// crescente
		for (i = 0; i < tamanhoVetor; i++) {
			for (j = 0; j < tamanhoVetor; j++) {
				if (vOrdenado[i] < vOrdenado[j]) {
					aux = vOrdenado[i];
					vOrdenado[i] = vOrdenado[j];
					vOrdenado[j] = aux;
				}
			}
		}

		for (i = 0; i < tamanhoVetor; i++) {
			System.out.print(vOrdenado[i] + " ");
		}
		System.out.println("");

		// decrescente
		for (i = 0; i < tamanhoVetor; i++) {
			for (j = 0; j < tamanhoVetor; j++) {
				if (vOrdenado[i] > vOrdenado[j]) {
					aux = vOrdenado[i];
					vOrdenado[i] = vOrdenado[j];
					vOrdenado[j] = aux;
				}
			}
		}

		for (i = 0; i < tamanhoVetor; i++) {
			System.out.print(vOrdenado[i] + " ");
		}
		System.out.println("");

		System.out.print("Digite um numero a ser buscado: ");
		numeroBuscado = Integer.parseInt(sc.nextLine());

		for (i = 0; i < tamanhoVetor; i++) {
			if (v[i] == numeroBuscado) {
				verif = 1;
				posicao = i;
				break;
			}
		}
		if(verif == 1) {
			System.out.println("O valor existe no vetor e esta na posicao: " + posicao);
		}else {
			System.out.println("O valor não existe no vetor");
		}

	}

}
