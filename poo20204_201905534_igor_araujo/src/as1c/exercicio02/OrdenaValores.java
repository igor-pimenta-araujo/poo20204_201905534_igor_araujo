/*
 * Exercicio: 2
 * */

package as1c.exercicio02;

import java.util.Scanner;

public class OrdenaValores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double v[] = new double[4], aux;
		int i, j;
		
		for(i = 1; i <= 3; i++) {
			System.out.println("Escreva o " + i + "º numero");
			v[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(i = 2; i < 4; i++) {
			for(j = 1; j < 4; j++) {
				if(v[i] < v[j]) {
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
		
		for(i = 1; i < 4; i++) {
			System.out.print(v[i] + " ");
		}			
		}
}