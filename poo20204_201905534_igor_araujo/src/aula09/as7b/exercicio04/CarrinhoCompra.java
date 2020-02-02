package aula09.as7b.exercicio04;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
	private int capacidade;
	private int quantidade;
	List<Produto> produtos = new ArrayList<Produto>();
	
	public CarrinhoCompra(int capacidade) {
		super();
		this.capacidade = capacidade;
		this.quantidade = 0;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void adicionaProduto(Produto p) {
		if(quantidade < capacidade) {
			produtos.add(p);
			quantidade++;
			System.out.println("Produto adicionado com sucesso");
		}else {
			System.out.println("Carrinho cheio");
		}
	}
	
	public void removeProduto(Produto p) {
		if(quantidade > 0) {
			produtos.remove(p);
			quantidade--;
			System.out.println("Produto removido com sucesso");
		}else {
			System.out.println("Carrinho vazio");
		}
		
		
	}
	
	public void listaProdutos() {
		if(quantidade > 0) {
			for(int i = 0; i < quantidade; i++) {
				System.out.println(produtos.get(i));
			}
		}else {
			System.out.println("Carrinho vazio");
		}
	}
	
}
