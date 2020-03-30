package aula20200327.carro;

public class Carro {

	private double combustivelNoTanqueEmLitros = 0.00;
	private boolean ligado = false;

	public void carro() {

		if (combustivelNoTanqueEmLitros < 0.250) {
			this.ligado = false;
		}

	}

	public void abastecer(double volumeEmLitros) {
		combustivelNoTanqueEmLitros += volumeEmLitros;
	}

	public void ligar() {
		if (combustivelNoTanqueEmLitros >= 0.250) {
			this.combustivelNoTanqueEmLitros -= 0.250;
			this.ligado = true;
		}
	}

	public void desligar() {
		this.ligado = false;
	}

	public void acelerar() {
		if (ligado == true) {
			if (combustivelNoTanqueEmLitros >= 0.250) {
				combustivelNoTanqueEmLitros -= 0.250;
			} else
				this.ligado = false;
		}

	}

	public boolean isLigado() {
		return this.ligado;
	}

	public boolean isDesligado() {
		return this.ligado;
	}

	public double getCombustivelNoTanqueEmLitros() {
		return combustivelNoTanqueEmLitros;
	}

	public Carro(double combustivelNoTanqueEmLitros) {
		this.combustivelNoTanqueEmLitros = combustivelNoTanqueEmLitros;
	}

	

}
