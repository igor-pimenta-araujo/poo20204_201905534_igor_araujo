package aula12.as10b.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorSomador implements SomadorEsperado{
	private SomadorExistente somadorExistente;
	
	public AdaptadorSomador(SomadorExistente somadorExistente) {
		this.somadorExistente = somadorExistente;
	}



	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		int soma = 0;
		int tamanhoVetor = vetor.length;
		for(int i = 0; i < tamanhoVetor; i++) {
			lista.add(vetor[i]);
		}
		soma = somadorExistente.somaLista(lista);
		return soma;
	}
	
	
}
