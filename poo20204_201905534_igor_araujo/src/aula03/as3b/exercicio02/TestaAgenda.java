/*
 * Exercicio 02
 * */

package aula03.as3b.exercicio02;

public class TestaAgenda {

	public static void main(String[] args) {
		Agenda ag = new Agenda();
		
		ag.armazenaPessoa("Igor", 19, 180);
		ag.armazenaPessoa("Gerva", 19, 180);
		ag.armazenaPessoa("Joao", 19, 180);
		
		System.out.println("\nImprimindo a agenda:");
		ag.imprimeAgenda();
		
		System.out.println("\nRemovendo uma pessoa que não existe na lista e depois removendo uma existente:");		
		ag.removePessoa("Funky");
		ag.removePessoa("Igor");
		
		System.out.println("\nImprimindo a agenda:");
		ag.imprimeAgenda();
		
		System.out.println("\nImprimindo a pessoa:");
		ag.imprimePessoa(0);

	}

}
