package aula06.salaaula.endereco;

public class TestaPais {

	public static void main(String[] args) {
		Pais p = new Pais("Brasil");
		
		p.adicionaEstado("Go", "Goiania", p);
		p.adicionaEstado("Sp", "Sao Paulo", p);
		p.adicionaEstado("Rj", "Rio de Janeiro", p);
		
		

	}

}
