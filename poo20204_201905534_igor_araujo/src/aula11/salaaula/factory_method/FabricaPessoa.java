package aula11.salaaula.factory_method;

public class FabricaPessoa extends Fabrica {

	public Pessoa criaPessoa(String nome, String sexo) {
		Pessoa p = null;
		if (sexo.equals("M")) {
			p = new Homem(nome);
		}
		if (sexo.equals("F"))
		return new Mulher(nome);
		}
}
