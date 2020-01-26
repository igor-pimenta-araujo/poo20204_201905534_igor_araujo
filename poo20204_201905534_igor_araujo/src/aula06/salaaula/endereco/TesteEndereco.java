package aula06.salaaula.endereco;

public class TesteEndereco {

	public static void main(String[] args) {
		Pais pais = new Pais("Brasil");
		Estado goias = new Estado("GO", "Goias", pais);
		Municipio goiania = new Municipio(new Long(25300), "Goiania", goias);
		Bairro bairro = new Bairro("Central", "Setor Central", goiania);
		Logradouro log = new Logradouro("Paranaiba", TipoLogradouro.AVENIDA);

		Endereco end = new Endereco("520", "qd. 45", 74043010, "Residencial", bairro, log);

		System.out.println(end);
		
		System.out.println("\n" + end);
	}

}
