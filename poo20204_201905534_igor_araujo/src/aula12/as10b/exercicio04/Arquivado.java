package aula12.as10b.exercicio04;

public class Arquivado implements EstadosProcesso{
	
	@Override
	public void arquivarProcesso(Processo p) {
		System.out.println("O processo ja est� arquivado");
	}
	
	@Override
	public void deferirProcesso(Processo p) {
		System.out.println("O processo ja foi arquivado e n�o � poss�vel deferi-lo");
	}
	
	@Override
	public void indeferirProcesso(Processo p) {
		System.out.println("O processo j� foi arquivado e n�o � poss�vel indeferi-lo");
	}
	
	@Override
	public void cancelarProcesso(Processo p) {
		System.out.println("O processo j� foi arquivado e n�o � poss�vel cancelar");
	}
}
