package aula11.as9b.exercicio03;

public class TestaIncremental {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Incremental inc = Incremental.getInstancia();
			System.out.println(inc);
		}
	}
}
