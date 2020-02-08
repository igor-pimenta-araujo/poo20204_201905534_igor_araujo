package aula12.salaaula.state.porta;

public class PortaAberta implements EstadosPorta {

	@Override
	public void abrir(Porta p) {
		System.out.println("Ja estou aberta");
	}

	@Override
	public void fechar(Porta p) {
		p.setEstadoAtual(new PortaFechada());
	}

	@Override
	public void trancar(Porta p) {
		System.out.println("N�o � possivel, a porta est� aberta");
	}

	@Override
	public void destrancar(Porta p) {
		System.out.println("Ja est� destrancada");
	}

}
