package aula12.as10b.exercicio04;

public class Arquivado implements EstadosProcesso{
	
	@Override
	public void arquivarProcesso(Processo p) {
		System.out.println("O processo ja está arquivado");
	}
	
	@Override
	public void deferirProcesso(Processo p) {
		System.out.println("O processo ja foi arquivado e não é possível deferi-lo");
	}
	
	@Override
	public void indeferirProcesso(Processo p) {
		System.out.println("O processo já foi arquivado e não é possível indeferi-lo");
	}
	
	@Override
	public void cancelarProcesso(Processo p) {
		System.out.println("O processo já foi arquivado e não é possível cancelar");
	}
}
