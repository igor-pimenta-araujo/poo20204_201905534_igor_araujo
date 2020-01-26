package aula04.as4b.exercicio01.contexto.clientes;

public class TestaCliente {
	public static void main(String[] args) {
	Endereco end1 = new Endereco("Alameda dos Buritis", "Ed. Ana Paula", "Setor Oeste", "Goiania", "Goias", 520, 74015080);
	Cliente cli1 = new Cliente("Igor", "04809155129", end1);
	
	System.out.println(cli1);

	}

}
