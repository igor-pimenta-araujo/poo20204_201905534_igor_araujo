package aula09.salaaula;

public class ClasseConcreta extends ClasseAbstrata{

	public void metodoAbstrato() {
		System.out.println("Implementa��o do m�todo abstrato da classe: " + super.getClass().getSimpleName() + " na classe: " + this.getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		ClasseConcreta cc = new ClasseConcreta();
		cc.metodoAbstrato();
		cc.metodoConcreto();
	}
}
