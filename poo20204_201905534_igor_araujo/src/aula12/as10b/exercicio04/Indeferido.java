package aula12.as10b.exercicio04;

public class Indeferido implements EstadosProcesso{
	
	@Override
	public void arquivarProcesso(Processo p) {
		p.setEstadoProcesso(new Arquivado());
	}
	
	@Override
	public void deferirProcesso(Processo p) {
		System.out.println("O processo já foi negado (Indeferido) e não pode ser aceito(Deferido)");
	}
	
	@Override
	public void indeferirProcesso(Processo p) {
		System.out.println("O processo já foi negado (Indeferido)");
	}
	
	@Override
	public void cancelarProcesso(Processo p) {
		p.setEstadoProcesso(new Cancelado());
	}
}
