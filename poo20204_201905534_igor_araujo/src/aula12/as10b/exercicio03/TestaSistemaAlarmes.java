package aula12.as10b.exercicio03;

public class TestaSistemaAlarmes {
	public static void main(String[] args) {
		Seguradora cs = new Seguradora();
		Policia p = new Policia();
		Alarme a = new Alarme();
		Sensor s1 = new Sensor();
		Sensor s2 = new Sensor();
		
		a.registerObserver(p);
		a.registerObserver(cs);
		s1.registerObserver(a);
		s2.registerObserver(a);
		
		s1.sensorAtivado();
	}
}
