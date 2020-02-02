package aula09.salaaula;

public abstract class Eletrodomestico {
	private boolean ligado;
	private int voltagem;

	public Eletrodomestico(boolean ligado, int voltagem) {
		super();
		this.ligado = ligado;
		this.voltagem = voltagem;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	//só pode ter metodo abstrato uma classe abstrata
	protected abstract void ligar();
	protected abstract void desligar();
}
