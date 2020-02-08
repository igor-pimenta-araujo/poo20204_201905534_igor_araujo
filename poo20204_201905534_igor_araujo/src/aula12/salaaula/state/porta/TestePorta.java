package aula12.salaaula.state.porta;

public class TestePorta {

	public static void main(String[] args) {
		Porta p = new Porta();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
		
		p.trancar(p);
		p.abrir(p);
		
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
	}

}
