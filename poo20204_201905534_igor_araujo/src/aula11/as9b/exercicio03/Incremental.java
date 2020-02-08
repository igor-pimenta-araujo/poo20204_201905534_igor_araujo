package aula11.as9b.exercicio03;

public class Incremental {
	public static Incremental instancia = new Incremental();
	private static int count = 0;
	private int numero;

	protected Incremental() {
		numero = ++count;
	}
	
	public static Incremental getInstancia() {
		if(instancia == null) {
			instancia = new Incremental();
		}
		return instancia;
	}

	public String toString() {
		return "Incremental: " + numero;
	}
}
 