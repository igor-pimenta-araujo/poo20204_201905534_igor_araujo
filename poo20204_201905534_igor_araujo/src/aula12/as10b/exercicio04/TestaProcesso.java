package aula12.as10b.exercicio04;

public class TestaProcesso {

	public static void main(String[] args) {
		Processo p = new Processo();
		System.out.println("Estado do processo: " + p.getEstadoProcesso().getClass().getSimpleName());
		
		p.deferirProcesso();
		System.out.println("Estado do processo: " + p.getEstadoProcesso().getClass().getSimpleName());
		
		p.cancelarProcesso();
		System.out.println("Estado do processo: " + p.getEstadoProcesso().getClass().getSimpleName());
		
		p.arquivarProcesso();
		System.out.println("Estado do processo: " + p.getEstadoProcesso().getClass().getSimpleName());
	}

}
