package aula14.salaaula.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import util.ConverteData;


public class PessoaTeste {
	private Pessoa pessoa;
	
	@Before
	public void setup() {
		pessoa = new Pessoa();
	}
	
	@Test
	public void testaIdade() {
		pessoa.setNome("Malaquias");
		pessoa.setAltura(175);
		try {
			pessoa.setDataNascimento(ConverteData.convertStringToDate("20/10/2000"));
		}catch (Exception e) {
			e.getMessage();
		}
		assertTrue(pessoa.calculaIdade() == 20);
	}
}
