package aula04.as4b.exercicio01.contexto.musica;

public class TextaMusica {
	public static void main(String[] args) {
	
	Compositor compositor= new Compositor("Led Zepellin", "Britanico");
	Musica stairway = new Musica("Stairway to heaven", 1971, "Rock", compositor);
	
	Compositor compositor2= new Compositor("MC PH", "Brasileiro");
	Musica cypher = new Musica("Cypher 4m", 2017, "Funk", compositor2);
	
	
	System.out.println(stairway);
	System.out.println(cypher);
	}
}
