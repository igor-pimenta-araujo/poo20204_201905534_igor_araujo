package aula04.as4b.exercicio03;

public class TestaSistema {

	public static void main(String[] args) {
		Caixa caixa1 = new Caixa("Joao", "8596-7485", 1010, 1200, "Diurno");
		Gerente  gerente1 = new Gerente("DeMolay", "4152-6322", 1212, 5000, 500, "PF");
		
		Cliente cliente1 = new Cliente("Igor", "99632-5457", 20, "047852963");
		Cliente cliente2 = new Cliente("Gerva", "97418-6314", 21, "07458532");
		Cliente cliente3 = new Cliente("Tiago", "98512-8732", 19, "085746241");
		
		cliente3.desativar();
		
		caixa1.aumentaSalario(10);
		gerente1.aumentaSalario(20);
		
		System.out.println(caixa1);
		System.out.println("Recebimento anual: " + caixa1.recebimentoAnual());
		
		System.out.println(gerente1);
		System.out.println("Recebimento anual: " + gerente1.recebimentoAnual());
		
		cliente1.dadosCliente();
		cliente2.dadosCliente();
		cliente3.dadosCliente();
	}

}
