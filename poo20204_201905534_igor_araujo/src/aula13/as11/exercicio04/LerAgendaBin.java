package aula13.as11.exercicio04;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LerAgendaBin {

	public static void main(String[] args) throws IOException {

		 FileInputStream arq = new FileInputStream("agendaBinario.dat");
	     DataInputStream lerArquivo = new DataInputStream(arq);
	     
	     String nome = lerArquivo.readUTF();
	     System.out.println(nome);
	     
	     lerArquivo.close();
		
	}
}
