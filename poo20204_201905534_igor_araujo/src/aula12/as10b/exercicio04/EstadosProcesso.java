package aula12.as10b.exercicio04;

public interface EstadosProcesso {
	void arquivarProcesso(Processo p);
	void deferirProcesso(Processo p);
	void indeferirProcesso(Processo p);
	void cancelarProcesso(Processo p);
}
