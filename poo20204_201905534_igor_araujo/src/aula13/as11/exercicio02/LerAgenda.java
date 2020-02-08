package aula13.as11.exercicio02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import aula13.as11.exercicio01.Pessoa;
import aula13.as11.exercicio01.TestaAgenda;

public class LerAgenda {
 
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("agenda.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader bf = new BufferedReader(isr);
		
		String s = bf.readLine(); 
		
		while(s != null) {
			System.out.println(s);
			s = bf.readLine();
		}
		
		bf.close();

	}

}
