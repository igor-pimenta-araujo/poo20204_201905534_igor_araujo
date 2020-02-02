package aula09.salaaula;

public class Exemplo implements IExemplo {

	@Override
	public void metodo1() {
		System.out.println("Implementando o metodo 1");
	}
	
	@Override
	public void metodo2() {
		System.out.println("Implementando o metodo 2");
	}
	
	public static void main(String[] args) {
		Exemplo ex = new Exemplo();
		
		ex.metodo1();
		ex.metodo2();
	}

	

}
