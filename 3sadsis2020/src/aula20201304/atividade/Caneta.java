package aula20201304.atividade;

public class Caneta {

	private String cor;
	private String nomeModelo;
	private float tamanhoPonta;
	private double quantidadeDeCarga;
	private boolean estaTampada;

	

	public Caneta() {
		this.quantidadeDeCarga = 1.00; // quantidade em ML
		this.estaTampada = true;
	}
	
	public Caneta(String cor, String nomeModelo, float tamanhoPonta) {
		this.cor = cor;
		this.nomeModelo = nomeModelo;
		this.tamanhoPonta = tamanhoPonta;

	}

//método de acesso
	public String getCor() {
		return cor;
	}
	
//método de modificação	
	public void setCor(String cor) {
		this.cor = cor;
	}



	public void destampar() {
		this.estaTampada = false;
	}

	public void tampar() {
		this.estaTampada = true;
	}

	public void reabastecer() {
		if (quantidadeDeCarga < 1.00) {
			this.quantidadeDeCarga = 1.00;
		}
	}

	public String rabiscar(String rabisco) {
		if (estaTampada == false) {
			if (quantidadeDeCarga > 0) {
				// rabiscando... e cada rabiscada ele perde 0.01ml
				this.quantidadeDeCarga -= 0.01;
				return "Rabisco: "+rabisco;
			}
		}
		return semTintaOuTampada();  //sem tinta ou tampada
	}
	
	public String semTintaOuTampada() {
		if(estaTampada == true) {
			return "Está tampada";
		}
		 return "Está sem carga";
	}
	 

}
