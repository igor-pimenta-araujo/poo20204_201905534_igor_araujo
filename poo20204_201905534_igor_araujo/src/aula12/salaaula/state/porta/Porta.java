package aula12.salaaula.state.porta;

public class Porta implements EstadosPorta{
	EstadosPorta estadoAtual;

	public Porta() {
		estadoAtual = new PortaFechada();
	}

	public void abrir(Porta p) {
		estadoAtual.abrir(this);
	}

	public void fechar(Porta p) {
		estadoAtual.fechar(this);
	}

	public EstadosPorta getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(EstadosPorta estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public void trancar(Porta p) {
		estadoAtual.trancar(this);
	}

	public void destrancar(Porta p) {
		estadoAtual.destrancar(this);
	}
}
