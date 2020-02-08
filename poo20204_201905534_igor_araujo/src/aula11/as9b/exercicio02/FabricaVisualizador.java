package aula11.as9b.exercicio02;

public class FabricaVisualizador {
	
	public Visualizador criaVisualizador(String extensao) {
		if(extensao.equalsIgnoreCase("JPG")) {
			return new VisualizadorJPG();
		}else if(extensao.equalsIgnoreCase("BMP")){
			return new VisualizadorBMP();
		}else {
			throw new IllegalArgumentException("Tipo de extensão não suportada");
		}
	}

}