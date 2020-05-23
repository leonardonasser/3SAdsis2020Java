package pacoteSistema;

import java.util.ArrayList;


public class Turma {

	private String codigo;
	private ArrayList<Aluno> listaAluno = new ArrayList<>();
	private Aluno lider;
	
	
	public Turma(String codigo) {
		this.codigo = codigo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void adicionarAluno(Aluno novoAluno) {
		this.listaAluno.add(novoAluno);
	}
	
	public ArrayList<Aluno> getAlunos() {
		return listaAluno; 
	}
	
	public void setLider(Aluno novoLider) {
		this.lider = novoLider;
	}
	
	public Aluno getLider() {
		return lider;
	}
	
}
