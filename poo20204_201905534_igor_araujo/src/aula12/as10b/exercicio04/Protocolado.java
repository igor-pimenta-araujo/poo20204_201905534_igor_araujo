package aula12.as10b.exercicio04;

public class Protocolado implements EstadosProcesso{

	@Override
	public void arquivarProcesso(Processo p) {
		p.setEstadoProcesso(new Arquivado());
	}

	@Override
	public void deferirProcesso(Processo p) {
		p.setEstadoProcesso(new Deferido());
	}

	@Override
	public void indeferirProcesso(Processo p) {
		p.setEstadoProcesso(new Indeferido());
	}

	@Override
	public void cancelarProcesso(Processo p) {
		p.setEstadoProcesso(new Cancelado());
	}
	
	
}
