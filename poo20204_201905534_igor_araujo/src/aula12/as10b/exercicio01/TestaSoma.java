package aula12.as10b.exercicio01;

public class TestaSoma {

	public static void main(String[] args) {
		SomadorExistente se = new SomadorExistente();
		AdaptadorSomador as = new AdaptadorSomador(se);
		Cliente c = new Cliente(as);
		
		c.executar();
		
	}

}
