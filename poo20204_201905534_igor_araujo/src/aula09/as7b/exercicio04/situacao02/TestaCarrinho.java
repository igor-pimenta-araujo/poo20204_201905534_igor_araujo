package aula09.as7b.exercicio04.situacao02;

public class TestaCarrinho {

	public static void main(String[] args) {
		Produto p = new Produto("Men XtraCoool", "Rexona", 16.99);
		Carrinho c = new Carrinho(2);
		
		c.adicionaProduto(p);
		c.adicionaProduto(p);
		c.adicionaProduto(p);
	}

}
