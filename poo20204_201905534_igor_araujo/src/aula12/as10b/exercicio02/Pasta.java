package aula12.as10b.exercicio02;

import java.util.ArrayList;

public class Pasta extends Componente{
	ArrayList<Componente> c;
	
	public Pasta(String nome) {
		super(nome);
	}
	
	public void adicionaComponente(Componente componente) {
		c.add(componente);
	}
	
	
}	
