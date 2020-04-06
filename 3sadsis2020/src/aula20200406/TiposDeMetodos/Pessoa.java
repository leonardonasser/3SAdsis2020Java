package aula20200406.TiposDeMetodos;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private double altura;

	public Pessoa(String nome, int idade, double peso, double altura) {
		if (nome.length() > 1) {
			this.nome = nome;
		} else {
			throw new RuntimeException("O nome precisa ter mais de uma letra e não pode ser nulo");
		}

		this.idade = idade;
		this.peso = peso;

		if (altura > 0.25) {
			this.altura = altura;
		} else {
			throw new RuntimeException("A altura precisa ser maior que 25cm");
		}
	}

	public double getIMC() {
		return peso / (altura * altura);
	}

	// Olha um getter aqui!
	public String getNome() {
		return this.nome;
	}

	// Olha um setter aqui!
	public void setNome(String nome) {
		if (nome.length() > 1) {
			this.nome = nome;
		} else {
			throw new RuntimeException("O nome precisa ter mais de uma letra e não pode ser nulo");
		}
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		if (altura > 0.25) {
			this.altura = altura;
		} else {
			throw new RuntimeException("A altura precisa ser maior que 25cm");
		}
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		if (peso <= 0) {
			throw new RuntimeException("Peso deve ser maior que zero!");
		}
		this.peso = peso;
	}

}