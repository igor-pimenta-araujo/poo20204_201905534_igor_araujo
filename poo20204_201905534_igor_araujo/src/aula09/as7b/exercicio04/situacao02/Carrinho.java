package aula09.as7b.exercicio04.situacao02;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private int capacidade;
	private int quantidade;
	List<Produto> produtos = new ArrayList<Produto>();
	
	public Carrinho(int capacidade) {
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

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void adicionaProduto(Produto p) {
		if(quantidade < capacidade) {
			produtos.add(p);
			quantidade++;
			System.out.println("Produto adicionado!");
		}else {
			System.out.println("Carrinho cheio");
		}
	}
}
