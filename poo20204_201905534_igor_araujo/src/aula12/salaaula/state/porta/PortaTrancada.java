package aula12.salaaula.state.porta;

public class PortaTrancada implements EstadosPorta {

	@Override
	public void abrir(Porta p) {
		System.out.println("Estou trancada");
	}

	@Override
	public void fechar(Porta p) {
		System.out.println("Estou trancada e fechada!");

	}

	@Override
	public void trancar(Porta p) {
		System.out.println("Ja estou trancada");
	}

	@Override
	public void destrancar(Porta p) {
		p.setEstadoAtual(new PortaDestrancada());
	}

}
