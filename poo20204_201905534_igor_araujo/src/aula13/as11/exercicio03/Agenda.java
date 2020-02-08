package aula13.as11.exercicio03;

import java.util.ArrayList;
import java.util.List;

import aula03.as3b.exercicio02.Pessoa;

public class Agenda {
	private int size = 0;
	private int i = 0;
	private List<Pessoa> pessoas;
	private boolean verificador = false;
	
	public Agenda() {
		this.pessoas = new ArrayList<Pessoa>();
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public void armazenaPessoa(String nome, int idade, float altura) {
		Pessoa p = new Pessoa(nome, idade, altura);
		if (size < 10) {
			this.pessoas.add(p);
			System.out.println("\n" + p.getNome() + " adicionado com sucesso a lista");
			size++;
		} else {
			System.out.println("\nERRO: A lista ja está cheia!");
		}
	}

	public void removePessoa(String nomeSelecionado) {
		for (i = 0; i < size; i++) {
			if (pessoas.get(i).getNome() == nomeSelecionado) {
				Pessoa p = pessoas.get(i);
				this.pessoas.remove(p);
				size--;
				System.out.println("\n" + nomeSelecionado + " removido com sucesso a lista");
				verificador = true;
				break;
			}
		}
		if (verificador == false) {
			System.out.println("\nPessoa não encontrada");
		} else {
			verificador = false;
		}
	}

	public void imprimeAgenda() {
		for(Pessoa p : this.pessoas) {
			System.out.println("\nNome: " + p.getNome());
			System.out.println("Altura: " + p.getAltura());
			System.out.println("Idade: " + p.getIdade());
		}
	}
	
	public String percorreAgenda() {
		String string = "";
		for(Pessoa p : this.pessoas) {
			string += "Nome: " + p.getNome() + "\nAltura: " + p.getAltura() + "\nIdade: " + p.getIdade() + "\n\n";
			/*System.out.println("\nNome: " + p.getNome());
			System.out.println("Altura: " + p.getAltura());
			System.out.println("Idade: " + p.getIdade());*/
		} 
		return string;
	}

	public void imprimePessoa(int index) {
		if (index < size) {
			System.out.println("\nNome: " + pessoas.get(index).getNome());
			System.out.println("Altura: " + pessoas.get(index).getAltura());
			System.out.println("Idade: " + pessoas.get(index).getIdade());
		} else {
			System.out.println("\nERRO: Pessoa não encontrada \nDigite um número de 0 até " + (size - 1));
		}
	}

}
