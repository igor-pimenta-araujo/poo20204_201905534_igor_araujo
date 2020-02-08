package aula13.as11.exercicio05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestaAgenda {

	public static void main(String[] args) throws IOException{
		Agenda ag = new Agenda();
		
		FileWriter arquivo = new FileWriter("agenda.txt");
        try (PrintWriter escreverNoArquivo = new PrintWriter(arquivo)) {
			ag.armazenaPessoa("Igor", 19, 180);
			ag.armazenaPessoa("Gerva", 19, 180);
			ag.armazenaPessoa("Joao", 19, 180);
			
			escreverNoArquivo.printf("Imprimindo a agenda:\n");
			//ag.imprimeAgenda();
			escreverNoArquivo.printf(ag.percorreAgenda());
		}
	}

}
