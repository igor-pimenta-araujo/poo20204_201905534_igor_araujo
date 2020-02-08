package aula11.as9b.exercicio02;

public class TesteFabricaImagem {

	public static void main(String[] args) {
		Visualizador visualizador;
		
		visualizador = new FabricaVisualizador().criaVisualizador("JPG");
		visualizador.visualiza();
		
		visualizador = new FabricaVisualizador().criaVisualizador("BMP");
		visualizador.visualiza();
		
		try {
            visualizador = new FabricaVisualizador().criaVisualizador("GIF");
            visualizador.visualiza();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
	}

}
