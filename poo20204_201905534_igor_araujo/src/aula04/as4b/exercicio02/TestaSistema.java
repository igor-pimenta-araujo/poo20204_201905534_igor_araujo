package aula04.as4b.exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaSistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanhoLista = 0;
		
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

		// Dados do aluno a ser inserido
		int matricula = -1;
		String nome;
		String cargo;
		String departamento;
		String cpf;
		double salario;
		
		// Dados do endereço a ser inserido
		String rua;
		String complemento;
		String bairro;
		String cidade;
		String estado;
		int numero;
		int quadra;
		int lote;

		while (matricula != 0) {
			System.out.println("Digite a matricula:");
			matricula = Integer.parseInt(sc.nextLine());
			if (matricula != 0) {
				System.out.println("Agora você irá digitar os outros dados do funcionario:");
				System.out.println("Nome:");
				nome = sc.nextLine();
				System.out.println("Cargo:");
				cargo = sc.nextLine();
				System.out.println("Departamento:");
				departamento = sc.nextLine();
				System.out.println("CPF:");
				cpf = sc.nextLine();
				System.out.println("Salario:");
				salario = Integer.parseInt(sc.nextLine());
				Funcionario funcionario = new Funcionario(nome, cargo, departamento, matricula, cpf, salario);
				listaFuncionarios.add(funcionario);
				System.out.println("Ok, obrigado, os dados do funcionario foram salvos");
				
				System.out.println("Agora você irá digitar os dados do endereço:");
				System.out.println("Rua:");
				rua = sc.nextLine();
				System.out.println("Complemento:");
				complemento = sc.nextLine();
				System.out.println("Bairro:");
				bairro = sc.nextLine();
				System.out.println("Cidade:");
				cidade = sc.nextLine();
				System.out.println("Estado:");
				estado = sc.nextLine();
				System.out.println("Numero:");
				numero = Integer.parseInt(sc.nextLine());
				System.out.println("Quadra:");
				quadra = Integer.parseInt(sc.nextLine());
				System.out.println("Lote:");
				lote = Integer.parseInt(sc.nextLine());
				Endereco endereco = new Endereco(rua, complemento, bairro, cidade, estado, numero, quadra, lote);
				System.out.println("Ok, obrigado, os dados do endereço e funcionario foram salvos");
				listaFuncionarios.get(tamanhoLista).setEndereco(endereco);
				tamanhoLista++;
			}else {
				for(int i = 0; i < tamanhoLista; i++) {
					listaFuncionarios.get(i).dadosFuncionario();
				}
			}
		}
		
		for(int i = 0; i < tamanhoLista; i++) {
			listaFuncionarios.get(i).aumentaSalario(30);
		}
		for(int i = 0; i < tamanhoLista; i++) {
			listaFuncionarios.get(i).dadosFuncionario();
		}
	}
}
