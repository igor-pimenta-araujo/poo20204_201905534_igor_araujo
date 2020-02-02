package aula09.as7b.exercicio02;

public class TestaGaleria {

	public static void main(String[] args) {
		Artista a1 = new Artista("Picasso", "Espanha", 25, 10, 1881);
		Artista a2 = new Artista("Igor", "Brasil", 5, 9, 2000);
		
		ObraArte[] listaObras = new ObraArte[4];
		
		listaObras[0] = new ObraArte("Guernica", 500000, 26, 6, 1937, "vendida", "quadro", "óleo sobre tela", a1);
		listaObras[1] = new ObraArte("Les demoiselles d'Avignon", 2903021, 6, 9, 1907, "vendida", "quadro", "óleo sobre tela", a1);
		listaObras[2] = new ObraArte("La escultura", 253000, 5, 11, 2017, "disponivel", "escultura", "mármore", a2);
		listaObras[3] = new ObraArte("Face Cristiano Ronaldo", 523164, 8, 3, 2019, "vendida", "escultura", "ouro", a2);
		
		int tamanhoLista = listaObras.length;
		
		for(int i = 0; i < tamanhoLista; i++) {
			System.out.println(listaObras[i]);
			System.out.println("\n");
		}
		
	}

}
