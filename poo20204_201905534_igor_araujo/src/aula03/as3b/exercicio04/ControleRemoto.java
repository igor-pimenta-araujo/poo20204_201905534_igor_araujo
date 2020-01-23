/*
 * Exercicio 4
 * */

package aula03.as3b.exercicio04;

public class ControleRemoto {
	private int volumeMaximo = 100;
	private int volumeMinimo = 0;
	private int canalMaximo = 120;
	private int canalMinimo = 1;

	Televisao t = new Televisao();

	public void aumentaVolume() {
		if (t.getVolume() == volumeMaximo) {
			System.out.println("O volume ja esta no maximo: " + t.getVolume());
		} else {
			t.setVolume(t.getVolume() + 1);
			System.out.println("O volume agora é: " + t.getVolume());
		}
	}

	public void diminuiVolume() {
		if (t.getVolume() == volumeMinimo) {
			System.out.println("O volume ja esta no minimo: " + t.getVolume());
		} else {
			t.setVolume(t.getVolume() - 1);
			System.out.println("O volume agora é: " + t.getVolume());
		}
	}

	public void aumentaCanal() {
		if (t.getCanal() == canalMaximo) {
			System.out.println("O canal ja esta no maximo: " + t.getCanal());
		} else {
			t.setCanal(t.getCanal() + 1);
			System.out.println("O canal agora é: " + t.getCanal());
		}
	}

	public void diminuiCanal() {
		if (t.getCanal() == canalMinimo) {
			System.out.println("O canal ja esta no minimo: " + t.getCanal());
		} else {
			t.setCanal(t.getCanal() - 1);
			System.out.println("O canal agora é: " + t.getCanal());
		}
	}

	public void selecionaCanal(int canalSelecionado) {
		if (canalSelecionado == t.getCanal()) {
			System.out.println("A televisão ja está no canal selecionado: " + t.getCanal());
		} else if (canalSelecionado <= canalMaximo && canalSelecionado >= canalMinimo) {
			System.out.println("Canal alterado com sucesso");
			t.setCanal(canalSelecionado);
			System.out.println("Canal indicado: " + t.getCanal());
		}
	}

	public void consultaCanal() {
		System.out.println("O canal da televisão é: " + t.getCanal());
	}

	public void consultaVolume() {
		System.out.println("O volume da televisão é: " + t.getVolume());
	}

}
