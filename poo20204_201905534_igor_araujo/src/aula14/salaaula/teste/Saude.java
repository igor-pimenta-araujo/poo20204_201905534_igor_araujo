package aula14.salaaula.teste;

public class Saude {
	private int idade;
	private double altura;
	private double peso;

	public Saude(int idade, double altura, double peso) {
		super();
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	
	public double calculaIMC() {
		double imc = peso / (altura*altura);
		return imc;
	}
	
	public String condicaoFisica() {
		double imc = calculaIMC();
		String resultado;
		if(imc < 18.5) {
			resultado = "Abaixo do peso";
		}else if(imc <= 24.9) {
			resultado = "Peso normal";
		}else if(imc <= 29.9) {
			resultado = "Sobrepeso";
		}else {
			resultado = "Obesidade";
		}
		return resultado;
	}
}
