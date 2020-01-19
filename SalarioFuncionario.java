/*
 * Exercicio 5
 * */

package as1c;

import java.util.Scanner;

public class SalarioFuncionario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int qntdFuncionarios;
			System.out.println("Digite a quantidade funcionarios a serem informados");
			qntdFuncionarios = Integer.parseInt(sc.nextLine());
			
			String nome[] = new String[qntdFuncionarios];
			double salario[] = new double[qntdFuncionarios], maiorSalario = 0, menorSalario = 0;
			double mediaSalario = 0;
			int posicaoMaiorSalario = 0, posicaoMenorSalario = 0;
			
			for(int i = 0; i < qntdFuncionarios; i++) {
				System.out.println("Informe o nome do funcionario: ");
				nome[i] = sc.nextLine();
				System.out.println("Informe o salario do funcionario: ");
				salario[i] = Integer.parseInt(sc.nextLine());
				if(salario[i] > maiorSalario) {
					maiorSalario = salario[i];
					posicaoMaiorSalario = i;
				}
				if(i == 0) {
					menorSalario = salario[i];
					posicaoMenorSalario = i;
				}else {
				if(salario[i] < menorSalario) {
					menorSalario = salario[i];
					posicaoMenorSalario = i;
				}
				}
				mediaSalario += salario[i];
			}
			mediaSalario = mediaSalario/qntdFuncionarios;
			
			System.out.println("--------=-----------=------------=-----------");
			System.out.println("Maior salario: ");
			System.out.println("Nome: " + nome[posicaoMaiorSalario]);
			System.out.println("Posicao: " + posicaoMaiorSalario);
			System.out.println("Salario: " + maiorSalario);
			
			System.out.println("--------=-----------=------------=-----------");
			System.out.println("Menor salario: ");
			System.out.println("Nome: " + nome[posicaoMenorSalario]);
			System.out.println("Posicao: " + posicaoMenorSalario);
			System.out.println("Salario: " + menorSalario);
			
			System.out.println("--------=-----------=------------=-----------");
			System.out.println("Media salarial: " + mediaSalario);
			
			System.out.println("--------=-----------=------------=-----------");
			System.out.println("Acima da media salarial: ");
			for(int i = 0; i < qntdFuncionarios; i++) {
				if(salario[i] > mediaSalario) {
					System.out.println("Nome: " + nome[i]);
					System.out.println("Salario: " + salario[i] + "\n");
				}
			}
			
			System.out.println("--------=-----------=------------=-----------");
			System.out.println("Abaixo da media salarial: ");
			for(int i = 0; i < qntdFuncionarios; i++) {
				if(salario[i] < mediaSalario) {
					System.out.println("Nome: " + nome[i]);
					System.out.println("Salario: " + salario[i] + "\n");
				}
			}
			System.out.println("--------=-----------=------------=-----------");
			
	}

}
