package aula12.salaaula.adapter.tomada;

public class TomadaTeste { 

	public static void main(String[] args) {
		TomadaTresPinos t3 = new TomadaTresPinos();
		
		TomadaAdapter t2 = new TomadaAdapter(t3);
			t2.ligarTomadaDoisPinos();
	}
} 