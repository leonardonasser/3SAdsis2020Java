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

	public CofreSeguro(int senhacofre) {
		super();
		this.senhacofre = senhacofre;
	}

	
}
