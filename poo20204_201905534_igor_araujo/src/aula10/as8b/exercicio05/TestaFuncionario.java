package aula10.as8b.exercicio05;

import java.util.ArrayList;
import java.util.List;

public class TestaFuncionario {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		double custoTotal = 0;
		double custoGraduacao = 0;
		double custoMedio = 0;
		double custoBasico = 0;
		
		//Exercicio 07 e 10
		Graduacao g1 = new Graduacao("Igor", 010401, "Colegio Sto Agostinho", "Sto Agostinho medio", "UFG", "Gerente");
		Graduacao g2 = new Graduacao("Gerva", 020402, "Anglo", "Anglo medio", "IFG", "Supervisor");
		EnsinoMedio em1 = new EnsinoMedio("Herod", 030301, "Colegio Sto Agostinho", "Sto Agostinho medio", "Supervisor");
		EnsinoMedio em2 = new EnsinoMedio("Pegasus", 040302, "Colegio Sto Agostinho", "Sto Agostinho medio", "Vendedor");
		EnsinoMedio em3 = new EnsinoMedio("Carpe", 050303, "Colegio Sto Agostinho", "Sto Agostinho medio", "Vendedor");
		EnsinoMedio em4 = new EnsinoMedio("Tiago", 060304, "Sto Agostinho", "Agostiniano", "Vendedor");
		EnsinoBasico eb1 = new EnsinoBasico("Isadora", 070201, "Delta", "Vendedor");
		EnsinoBasico eb2 = new EnsinoBasico("Leo", 80202, "Dimensão", "Vendedor");
		EnsinoBasico eb3 = new EnsinoBasico("Walter", 90203, "Orientar", "Vendedor");
		EnsinoBasico eb4 = new EnsinoBasico("Adel", 100204, "Sto Agostinho", "Vendedor");
		
		

		funcionarios.add(g1);
		funcionarios.add(g2);
		funcionarios.add(em1);
		funcionarios.add(em2);
		funcionarios.add(em3);
		funcionarios.add(em4);
		funcionarios.add(eb1);
		funcionarios.add(eb2);
		funcionarios.add(eb3);
		funcionarios.add(eb4);
		
		
		// Exercicio 07 e 10
		for (int i = 0; i < 10; i++) {
			custoTotal += funcionarios.get(i).getSalario() + funcionarios.get(i).getComissao();
			
			if (funcionarios.get(i) instanceof Graduacao) {
				custoGraduacao += funcionarios.get(i).getSalario() + funcionarios.get(i).getComissao();
			} else if (funcionarios.get(i) instanceof EnsinoMedio) {
				custoMedio += funcionarios.get(i).getSalario() + funcionarios.get(i).getComissao();
			} else if (funcionarios.get(i) instanceof EnsinoBasico) {
				custoBasico += funcionarios.get(i).getSalario() + funcionarios.get(i).getComissao();
			}
		}
		
		System.out.println("O custo total é: R$" + custoTotal);
		System.out.println("O custo dos graduados é: R$" + custoGraduacao);
		System.out.println("O custo dos funcionarios com apenas Ensino Medio é: R$" + custoMedio);
		System.out.println("O custo dos funcionarios com apenas Ensino Basico é: R$" + custoBasico);
		
		// Exericicio 11
		for(int i = 0; i < 10; i++) {
			System.out.println("---=---=---=---=---=---=---=---");
			System.out.println(funcionarios.get(i));
		}
	}
}
