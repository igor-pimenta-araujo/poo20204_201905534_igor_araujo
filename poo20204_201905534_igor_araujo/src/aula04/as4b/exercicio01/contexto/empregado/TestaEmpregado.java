package aula04.as4b.exercicio01.contexto.empregado;

public class TestaEmpregado {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Alameda dos Buritis", "Ed. Ana Paula", "Setor Oeste", "Goiania", "Goias", 520, 74015080);
		Empresa empresa = new Empresa("Hardsystem", "1515494", endereco);
		Empregado empregado = new Empregado("Igor", "1511551", empresa);
		
		System.out.println(empregado);
	}

}
