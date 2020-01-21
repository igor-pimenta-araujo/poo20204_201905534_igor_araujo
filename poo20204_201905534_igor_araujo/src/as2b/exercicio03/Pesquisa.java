/*
 *  Exercicio: 3
 */

package as2b.exercicio03;
import java.util.Scanner;

public class Pesquisa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maiorIdade = 0, idade = 1;
		int cabelo, olho, sexo;
		double qntdMulher = 0, qntdAlvo = 0;
		while(idade > 0) {
			System.out.println("Qual a idade da pessoa?");
			idade = Integer.parseInt(sc.nextLine());
			if(idade > 0) {
				if(idade > maiorIdade) {
					maiorIdade = idade;
				}
				System.out.println("Qual o sexo da pessoa?(1 - Masculino | 2 - Feminino)");
				sexo = Integer.parseInt(sc.nextLine());
				if(sexo == 2) {
					qntdMulher = qntdMulher + 1;
				}
				System.out.println("Qual a cor dos cabelos da pessoa?(1 - louros | 2 - castanhos | 3 - pretos)");
				cabelo = Integer.parseInt(sc.nextLine());
				System.out.println("Qual a cor dos olhos da pessoa?(1 - azuis | 2 - verdes | 3 - castanhos)");
				olho = Integer.parseInt(sc.nextLine());
				if(idade >= 18 && idade <= 35 && cabelo == 1 && olho == 2 && sexo == 2) {
					qntdAlvo = qntdAlvo + 1;
				}
				}
			}
			System.out.println("A pessoa mais velha tem: " + maiorIdade + " anos.");

			double porcentagem = (qntdAlvo/qntdMulher)*100;
			System.out.println(porcentagem);
			System.out.println("A  porcentagem de indivíduos do sexo feminino cuja idade esteja entre 18 e 35 anos,\r\n" + 
					"inclusive, e que tenham olhos verdes e cabelos louros é: " + porcentagem + "%");
	}
}
