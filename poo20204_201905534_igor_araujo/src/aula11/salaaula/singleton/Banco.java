package aula11.salaaula.singleton;

public final class Banco {
	public static Banco instancia;
	int codigo;
	String nome;
	
	private Banco() {
		codigo = 001;
		nome = "Banco do Brasil S/A";
	}
	
	public Banco getInstancia() {
		if(instancia == null) {
			instancia = new Banco();
		}
		return instancia;
	}
}
