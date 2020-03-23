package cofre;

public class CofreSeguro {

	private boolean aberto = false;
	private int senhacofre;

	public void abrir(int senhaTestar) {
		
		if (senhaTestar == senhacofre) {
			aberto = true;
		} 
		
		
	}

	public void fechar() {
		aberto = false;
	}

	public boolean isAberto() {
		return aberto;
	}

	public int getSenhacofre() {
		return senhacofre;
	}

	public void setSenhacofre(int senhacofre) {
		this.senhacofre = senhacofre;
	}

}
