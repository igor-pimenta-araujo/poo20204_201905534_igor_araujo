package aula09.as7b.exercicio04;

public class TestaProduto {

	public static void main(String[] args) {
		Editora editora = new Editora("Editora Abril", "546.123.89");
		Editora editora2 = new Editora("Editora FlatOut", "789.654.12");
		Revista revista = new Revista("Não Perecivel", "Quatro Rodas", 16.99, 3, editora);
		Revista revista2 = new Revista("Não Perecivel", "FlatOut", 18.99, 5, editora2);
		
		CarrinhoCompra carrinho = new CarrinhoCompra(2);
		
		carrinho.adicionaProduto(revista);
		carrinho.adicionaProduto(revista2);
		carrinho.adicionaProduto(revista);
		
		carrinho.removeProduto(revista);
		
		carrinho.adicionaProduto(revista2);
		
		carrinho.listaProdutos();
		
		
	}

}
