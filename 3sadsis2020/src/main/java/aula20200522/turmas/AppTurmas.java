package pacoteSistema;

import pacoteSistema.Aluno;
import pacoteSistema.Turma;

public class App {
	
	
	public static void main(String[] args) {
	Turma ads = new Turma("Ads3sis");

	
	ads.adicionarAluno(new Aluno("João","75862"));
	
	ads.adicionarAluno(new Aluno("leonardo","135686"));
	
	ads.adicionarAluno(new Aluno("luis","876322"));
	
	ads.setLider(new Aluno("leonardo","135686"));
	
	mostrarTurma(ads);
	
	}
	
	private static void mostrarTurma(Turma turma) {
		System.out.println("Nome turma: " + turma.getCodigo());
		System.out.println("Nome Líder: " + turma.getLider().getnome());	
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Alunos: ");
		for (Aluno a : turma.getAlunos()) {
			System.out.println("Ra: "+ a.getRa() + "  "+"Nome: " + a.getnome());
	}
}
	

}
