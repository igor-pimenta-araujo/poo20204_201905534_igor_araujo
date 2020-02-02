package aula10.salaaula.animal;

public class MundoAnimal {

	public static void main(String[] args) {
		Animal reino[] = new Animal[3];
		
		reino[0] = new Anfibio("Salamandra");
		reino[1] = new Ave("Quero-quero");
		reino[2] = new Peixe("Dourado");
		
		int tamVetor = reino.length;
		
		for (int i = 0; i < tamVetor; i++) {
			if(reino[i] instanceof Peixe) {
				((Peixe) reino[i]).nadar();
			}else {
				reino[i].mover(10, 10);
			}
		}
		
		/*for (Animal a : reino) {
			a.mover(10, 10);
		}*/
	}

}
