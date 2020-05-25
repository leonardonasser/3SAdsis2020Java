package paisEEstados;

import java.util.ArrayList;

public class Pais {

	private String nome;
	private int codDDI;
	private ArrayList<Estado> listaEstados = new ArrayList<>();

	public Pais(String nome, int codDDI) {
		this.nome = nome;
		this.codDDI = codDDI;
	}

	public String getNome() {
		return nome;
	}

	public int getCodDDI() {
		return codDDI;
	}

	public void addEstado(Estado e) {
		for (Estado estadoExistente : listaEstados) {
			if (estadoExistente.getSigla().equals(e.getSigla())) {
				return;
			}
		}
		listaEstados.add(e);
	}

	public ArrayList<Estado> getEstados() {
		return listaEstados;
	}

	public int contarEstados() {
		return listaEstados.size();
	}

}
