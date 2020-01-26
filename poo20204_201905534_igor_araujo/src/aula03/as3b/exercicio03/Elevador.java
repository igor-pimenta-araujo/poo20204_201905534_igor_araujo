/*
 * Exercicio 03
 * */

package aula03.as3b.exercicio03;

public class Elevador {
	private int capacidade;
	private int totalAndares;
	private int andarAtual = 0;
	private int quantidadePessoasPresentes = 0;

	public Elevador(int capacidade, int totalAndares) {
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getQuantidadePessoasPresentes() {
		return quantidadePessoasPresentes;
	}

	public void setQuantidadePessoasPresentes(int quantidadePessoasPresentes) {
		this.quantidadePessoasPresentes = quantidadePessoasPresentes;
	}
	
	public void entraPessoa() {
		if(quantidadePessoasPresentes < capacidade) {
			quantidadePessoasPresentes++;
			System.out.println("\nA pessoa entrou com sucesso!");
		}else {
			System.out.println("\nO elevador está cheio");
		}
	}
	
	public void saiPessoa() {
		if(quantidadePessoasPresentes > 0) {
			quantidadePessoasPresentes--;
			System.out.println("\nA pessoa saiu com sucesso!");
		}else {
			System.out.println("\nNão tem ninguem no elevador");
		}
	}
	
	public void sobe() {
		if(andarAtual < totalAndares) {
			andarAtual++;
			System.out.println("\nO elevador subiu com sucesso e está no: " + andarAtual + "º andar");
		}else {
			System.out.println("\nO elevador ja está no ultimo andar");
		}
	}
	
	public void desce() {
		if(andarAtual > 0) {
			andarAtual--;
			if(andarAtual > 0) {
				System.out.println("\nO elevador desceu com sucesso e está no: " + andarAtual + "º andar");
			}else {
				System.out.println("\nO elevador desceu com sucesso e está no térreo agora");
			}	
		}else {
			System.out.println("\nO elevador ja está no térreo");
		}
	}
}
