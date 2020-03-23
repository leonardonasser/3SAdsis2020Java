package cofre;

public class Cofre {
	private boolean aberto = false;

	public void abrir() {
		aberto = true;
	}

	public void fechar() {
		aberto = false;
	}

	public boolean isAberto() {
		return aberto;
	}

}
