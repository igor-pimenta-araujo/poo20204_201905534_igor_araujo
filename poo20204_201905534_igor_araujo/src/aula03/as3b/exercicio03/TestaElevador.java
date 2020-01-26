/*
 * Exercicio 03
 * */

package aula03.as3b.exercicio03;

public class TestaElevador {
	public static void main(String[] args) {
		Elevador e = new Elevador(5, 10);
		
	e.entraPessoa();
	e.desce();
	e.saiPessoa();
	e.sobe();
	e.saiPessoa();
	e.sobe();
	e.desce();
	e.desce();
	e.desce();
	for(int i = 0; i < 11; i++) {
		e.sobe();
	}
	}

}
