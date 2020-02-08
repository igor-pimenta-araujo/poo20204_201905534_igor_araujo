package aula11.as9b.exercicio02;

public class VisualizadorBMP implements Visualizador{

	@Override
	public void visualiza() {
		ImagemBMP imagem = new ImagemBMP();
		imagem.carregar();
		imagem.exibir();
		imagem.fechar();
	}

}
