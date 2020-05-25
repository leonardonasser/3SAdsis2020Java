package paisEEstados;

public class Estado {

	private String nome;
	private String sigla;
	private int codDDD;
	
	
	public Estado(String nome, String sigla, int codDDD) {
    	this.nome = nome;
		this.sigla = sigla;
		this.codDDD = codDDD;
	}
	
	public String getNome() {
		return nome;
	}
	public String getSigla() {
		return sigla;
	}
	public int getCodDDD() {
		return codDDD;
	}

	
	
	
	
	
}
