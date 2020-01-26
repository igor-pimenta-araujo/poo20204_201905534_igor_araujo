package aula04.as4b.exercicio01.contexto.alunos;

public class TestaAluno {
	public static void main(String[] args) {
	Departamento departamento1 = new Departamento("Instituto de informatica", "INF");
	Curso curso1 = new Curso("Engenharia de Software", "ES", departamento1);
	Aluno aluno1 = new Aluno("Igor", 201905534, 2018, curso1);
	
	System.out.println(aluno1);
	}

}
