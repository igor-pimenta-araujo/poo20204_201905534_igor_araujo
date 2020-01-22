package aula04.salaaula;

import java.util.ArrayList;
import java.util.List;


public class TestaContaBancaria {

	public static void main(String[] args) {
		ContaBancaria contaBancaria = new ContaBancaria();
		contaBancaria.setSaldo(15000.0d);
		contaBancaria.setLimite(500.0d);
		contaBancaria.setNumero(326598);
		contaBancaria.setTipo("Corrente");
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli1 = new Cliente();
		cli1.setNome("Joao Carlos dos Santos");
		cli1.setEndereco("Rua Sucupira n. 35, Parque Amazonas, Goiania/GO");
		cli1.setCpf("191");
		
		Cliente cli2 = new Cliente();
		cli2.setNome("Denise Coates");
		cli2.setEndereco("Rua Sucupira n. 35, Parque Amazonas, Goiania/GO");
		cli2.setCpf("465");
		
		clientes.add(cli1);
		clientes.add(cli2);
		
		contaBancaria.setTitulares(clientes);
		
		System.out.println("Nome dos titulares da conta: ");
		
		for (Cliente c : contaBancaria.getTitulares()) {
			System.out.println(c.getNome());
		}
	}
}