package aula04.salaaula.heranca;

public class TestaHeranca {

	public static void main(String[] args) {
		Pessoa pessoa = new Cliente("Carlos", "Goiania", "32126598", "1235456", "Solteiro", "Masculino",
				5000.00, "Professor");
		
		System.out.println(pessoa.toString());
		
		if (pessoa instanceof Cliente) {
			Cliente c = (Cliente) pessoa;
			c.adicionaInteresse("Futebol");
			c.adicionaInteresse("Literatura");
			c.removeInteresse("Futebol");
			String algumInteresse = c.consultaInteresse("Futebol");
			if (algumInteresse != null) {
				System.out.println("Interesse encontrado: " + algumInteresse);
			}else {
				System.out.println("Interesse não encontrado");
			}
		}
	}
}
