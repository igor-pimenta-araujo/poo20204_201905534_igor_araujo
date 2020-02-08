package aula12.as10b.exercicio04;

public class Deferido implements EstadosProcesso {

	@Override
	public void arquivarProcesso(Processo p) {
		p.setEstadoProcesso(new Arquivado());
	}

	@Override
	public void deferirProcesso(Processo p) {
		System.out.println("O processo já está aceito(Deferido)");
	}

	@Override
	public void indeferirProcesso(Processo p) {
		System.out.println("O processo ja foi aceito e não pode ser indeferido");
	}
	
	@Override
	public void cancelarProcesso(Processo p) {
		p.setEstadoProcesso(new Cancelado());
	}
}
