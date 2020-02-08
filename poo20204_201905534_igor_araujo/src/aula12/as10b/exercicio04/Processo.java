package aula12.as10b.exercicio04;

public class Processo {
	EstadosProcesso estadoProcesso;

	public Processo() {
		estadoProcesso = new Protocolado();
	}

	public EstadosProcesso getEstadoProcesso() {
		return estadoProcesso;
	}

	public void setEstadoProcesso(EstadosProcesso estadoProcesso) {
		this.estadoProcesso = estadoProcesso;
	}

	public void arquivarProcesso() {
		estadoProcesso.arquivarProcesso(this);
	}

	void deferirProcesso() {
		estadoProcesso.deferirProcesso(this);
	}

	void indeferirProcesso() {
		estadoProcesso.indeferirProcesso(this);
	}

	void cancelarProcesso() {
		estadoProcesso.cancelarProcesso(this);
	}

}
