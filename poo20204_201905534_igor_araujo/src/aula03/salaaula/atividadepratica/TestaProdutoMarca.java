package aula03.salaaula.atividadepratica;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaProdutoMarca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto p = new Produto();
		Marca m = new Marca();
		
		System.out.println("Voce registrara um produto e uma marca");

		System.out.println("Qual o nome do produto?");
		p.setNome(sc.nextLine());
		System.out.println("Qual o tipo do produto?");
		p.setTipo(sc.nextLine());
		System.out.println("Qual a cor do produto?");
		p.setCor(sc.nextLine());
		System.out.println("Qual a especificacao do produto?");
		p.setEspecificacao(sc.nextLine());
		System.out.println("Qual o tamanho do produto?");
		p.setTamanho(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Ok, agora pressione Enter para continuar e registrar uma marca");
		sc.nextLine();
		
		System.out.println("Qual o nome da marca?");
		m.setNome(sc.nextLine());
		System.out.println("Qual o cnpj da marca?");
		m.setCnpj(Integer.parseInt(sc.nextLine()));
		System.out.println("Qual o nome do responsavel pela marca?");
		m.setNomeContato(sc.nextLine());
		System.out.println("Qual o telefone do responsavel pela marca?");
		m.setTelefoneContato(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Agora informaremos os dados do produto e da marca, pressione Enter para continuar");
		sc.nextLine();
		
		System.out.println(p + "\n");
		System.out.println(m);

	}

}
