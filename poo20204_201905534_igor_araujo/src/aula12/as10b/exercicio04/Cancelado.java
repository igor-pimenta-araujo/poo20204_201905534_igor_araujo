package aula12.as10b.exercicio04;

public class Cancelado implements EstadosProcesso{
	
	@Override
	public void arquivarProcesso(Processo p) {
		p.setEstadoProcesso(new Arquivado());
	}
	
	@Override
	public void deferirProcesso(Processo p) {
		System.out.println("O processo j� foi cancelado e n�o � poss�vel deferi-lo");
	}
	
	@Override
	public void indeferirProcesso(Processo p) {
		System.out.println("O processo j� foi cancelado e n�o � poss�vel indeferi-lo");
	}
	
	@Override
	public void cancelarProcesso(Processo p) {
		System.out.println("O processo j� est� cancelado");
	}
}
