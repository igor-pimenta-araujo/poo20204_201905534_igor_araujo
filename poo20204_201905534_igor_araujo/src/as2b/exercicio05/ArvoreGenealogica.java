/*
 * Exercicio 5
*/

/*Tive um problema nessa quest�o em rela��o a classe Pessoa e o pai e a m�e serem da classe pessoa tambem,
 * pois quando eu digitava: Pessoa pai = Pessoa(); na linha 16, dava estouro de pilha (stackoverflow)
 * e n�o consegui pensar e nem achar na internet uma solu��o. 
*/

package as2b.exercicio05;
import java.util.Scanner;

public class ArvoreGenealogica {
	public static void main(String[] args) {
		
		class Pessoa{
		String nome;
		int idade;
		Pessoa pai = Pessoa();
		Pessoa mae = Pessoa();
		private Pessoa Pessoa() {
			return null;
		}
		}
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		Pessoa p4 = new Pessoa();
		Pessoa p5 = new Pessoa();
		
		System.out.println("Qual o nome da 1� pessoa?");
		p1.nome = sc.nextLine();
		System.out.println("Qual a idade da 1� pessoa");
		p1.idade = Integer.parseInt(sc.nextLine());
		System.out.println("Qual o nome do pai da 1� pessoa?");
		p1.pai.nome = sc.nextLine();
		System.out.println("Qual a idade do pai da 1� pessoa");
		p1.pai.idade = Integer.parseInt(sc.nextLine());
		System.out.println("Qual o nome da mae da 1� pessoa?");
		p1.mae.nome = sc.nextLine();
		System.out.println("Qual a idade da mae da 1� pessoa");
		p1.mae.idade = Integer.parseInt(sc.nextLine());
		
		System.out.println("Qual o nome da 2� pessoa?");
		p2.nome = sc.nextLine();
		System.out.println("Qual a idade da 2� pessoa");
		p2.idade = Integer.parseInt(sc.nextLine());
		System.out.println("Qual o nome do pai da 2� pessoa?");
		p2.pai.nome = sc.nextLine();
		System.out.println("Qual a idade do pai da 2� pessoa");
		p2.pai.idade = Integer.parseInt(sc.nextLine());
		System.out.println("Qual o nome da mae da 2� pessoa?");
		p2.mae.nome = sc.nextLine();
		System.out.println("Qual a idade da mae da 2� pessoa");
		p2.mae.idade = Integer.parseInt(sc.nextLine());
		
		System.out.println("Qual o nome da 3� pessoa?");
		p3.nome = sc.nextLine();
		System.out.println("Qual a idade da 3� pessoa");
		p3.idade = Integer.parseInt(sc.nextLine());
		System.out.println("Qual o nome do pai da 3� pessoa?");
		p3.pai.nome = sc.nextLine();
		System.out.println("Qual a idade do pai da 3� pessoa");
		p3.pai.idade = Integer.parseInt(sc.nextLine());
		System.out.println("Qual o nome da mae da 3� pessoa?");
		p3.mae.nome = sc.nextLine();
		System.out.println("Qual a idade da mae da 3� pessoa");
		p3.mae.idade = Integer.parseInt(sc.nextLine());
		
		System.out.println("Qual o nome da 4� pessoa?");
		p4.nome = sc.nextLine();
		System.out.println("Qual a idade da 4� pessoa");
		p4.idade = Integer.parseInt(sc.nextLine());
		System.out.println("Qual o nome do pai da 4� pessoa?");
		p4.pai.nome = sc.nextLine();
		System.out.println("Qual a idade do pai da 4� pessoa");
		p4.pai.idade = Integer.parseInt(sc.nextLine());
		System.out.println("Qual o nome da mae da 4� pessoa?");
		p4.mae.nome = sc.nextLine();
		System.out.println("Qual a idade da mae da 4� pessoa");
		p4.mae.idade = Integer.parseInt(sc.nextLine());
		
		System.out.println("Qual o nome da 5� pessoa?");
		p5.nome = sc.nextLine();
		System.out.println("Qual a idade da 5� pessoa");
		p5.idade = Integer.parseInt(sc.nextLine());
		System.out.println("Qual o nome do pai da 5� pessoa?");
		p5.pai.nome = sc.nextLine();
		System.out.println("Qual a idade do pai da 5� pessoa");
		p5.pai.idade = Integer.parseInt(sc.nextLine());
		System.out.println("Qual o nome da mae da 5� pessoa?");
		p5.mae.nome = sc.nextLine();
		System.out.println("Qual a idade da mae da 51� pessoa");
		p5.mae.idade = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nome da pessoa: " + p1.nome + "\nIdade da pessoa: " + p1.idade);
	}

}
