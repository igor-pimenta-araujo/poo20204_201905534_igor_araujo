package aula11.as9b.exercicio02;

public class VisualizadorJPG implements Visualizador {

	@Override
	public void visualiza() {
		ImagemJPG imagem = new ImagemJPG();
		imagem.carregar();
		imagem.exibir();
		imagem.fechar();
	}

}
