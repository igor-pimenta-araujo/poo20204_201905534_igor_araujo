package aula12.as10b.exercicio04;

public class Cancelado implements EstadosProcesso{
	
	@Override
	public void arquivarProcesso(Processo p) {
		p.setEstadoProcesso(new Arquivado());
	}
	
	@Override
	public void deferirProcesso(Processo p) {
		System.out.println("O processo já foi cancelado e não é possível deferi-lo");
	}
	
	@Override
	public void indeferirProcesso(Processo p) {
		System.out.println("O processo já foi cancelado e não é possível indeferi-lo");
	}
	
	@Override
	public void cancelarProcesso(Processo p) {
		System.out.println("O processo já está cancelado");
	}
}
