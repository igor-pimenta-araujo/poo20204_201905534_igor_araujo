package aula12.salaaula.adapter.tomada;

public class TomadaAdapter {
	private TomadaTresPinos tomadaTresPinos;

	public TomadaAdapter(TomadaTresPinos tomadaTresPinos) {
		this.tomadaTresPinos = tomadaTresPinos;
	}
	
	public void ligarTomadaDoisPinos() {
		tomadaTresPinos.ligarTomadaTresPinos();
	}
}
