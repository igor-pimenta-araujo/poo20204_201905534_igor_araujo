package aula13.as11.exercicio03;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestaAgendaBinario {

	public static void main(String[] args) throws IOException {
		Agenda ag = new Agenda();
		String s;

		/*
		 * FileOutputStream arq = new FileOutputStream("primeiroArquivo.dat");
		 * DataOutputStream gravarArq = new DataOutputStream(arq);
		 */
		
		FileOutputStream arquivo = new FileOutputStream("agendaBinario.dat");
		DataOutputStream gravarArquivo = new DataOutputStream(arquivo);
		
		ag.armazenaPessoa("Igor", 19, 180);
		ag.armazenaPessoa("Gerva", 19, 180);
		ag.armazenaPessoa("Joao", 19, 180);  
		
		s = ag.percorreAgenda();
		
		System.out.println("\nLista a ser gravada no agendaBinario.dat:\n" + s);
		gravarArquivo.writeUTF(s);
		
		gravarArquivo.close();
	}

}
 