package aula12.as10b.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends Componente{
	List<Pasta> listaPastas = new ArrayList<Pasta>();
	List<Arquivo> listaArquivos = new ArrayList<Arquivo>();
	private int numeroComponentes = 0;
	
	public Pasta(String nome) {
		super(nome);
	}
	
	public void adicionaArquivo(Arquivo arq) {
		listaArquivos.add(arq);
		this.numeroComponentes++;
	}
	
	public void adicionaPasta(Pasta p) {
		listaPastas.add(p);
		this.numeroComponentes++;
	}
	public void removeArquivo(Arquivo arq) {
		listaArquivos.remove(arq);
		this.numeroComponentes--;
	}
	
	public void removePasta(Pasta p) {
		listaPastas.remove(p);
		this.numeroComponentes--;
	}

	public int getNumeroComponentes() {
		return numeroComponentes;
	}
	
	public void mostrarPastas() {
		if(listaPastas.isEmpty()) {
			System.out.println("Pasta "+ this.getNome() + " não contem pastas\n");
		}else {
			int tamanhoPasta = listaPastas.size();
			for(int i = 0; i < tamanhoPasta; i++) {
				System.out.println("Pastas na Pasta: " + this.getNome());
				System.out.println("Pasta:: " + listaPastas.get(i).getNome() + "\n");
			}
		}
	}
	
	public void mostrarArquivos() {
		if(listaArquivos.isEmpty()) {
			System.out.println("Pasta "+ this.getNome() + " não contem arquivos\n");
		}else {
			int tamanhoPasta = listaArquivos.size();
			for(int i = 0; i < tamanhoPasta; i++) {
				System.out.println("Arquivos na Pasta: " + this.getNome());
				System.out.println("Arquivo:: " + listaArquivos.get(i).getNome() + " || Tamanho do arquivo:: " + listaArquivos.get(i).getTamanho() + "\n");
			}
		}
	}
	
}	
