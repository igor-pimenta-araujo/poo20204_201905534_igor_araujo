package aula09.as7b.exercicio03;

import java.util.ArrayList;
import java.util.List;

import aula09.as7b.exercicio02.Artista;
import aula09.as7b.exercicio02.ObraArte;

public class TestaGaleria {

	public static void main(String[] args) {
		List<Venda> vendas = new ArrayList<Venda>();
		Cliente c1 = new Cliente("Igor", "456.789.123-74", "8596-7412");
		Artista a1 = new Artista("Picasso", "Espanha", 25, 10, 1881);
		ObraArte ob1 =  new ObraArte("Guernica", 500000, 26, 6, 1937, "vendida", "quadro", "óleo sobre tela", a1);
		ObraArte ob2 =  new ObraArte("Les demoiselles d'Avignon", 2903021, 6, 9, 1907, "vendida", "quadro", "óleo sobre tela", a1);
		
		Venda v1 = new Venda(c1, ob1, 5, 9, 2019);
		Venda v2 = new Venda(c1, ob2, 5, 9, 2019);
		vendas.add(v1);
		vendas.add(v2);
		
		for (int i = 0; i < 2; i++) {
			System.out.print("------=------=------=------");
			System.out.println(vendas.get(i));
		}
		
	}

}
