package aula20200406.TiposDeMetodos;

public class AppTiposDeMetodos {
	
	public static void main(String[] args) {
		//DIA
		//Declara��o, Instancia��o, Atribui��o
		Pessoa maria = new Pessoa("Maria Das Gra�as",22,53,1.62);
		//maria.nome = "Maria das Gra�as";
		maria.setNome("Maria das Gra�as");
		maria.setAltura(1.62);
		maria.setIdade(22);
		maria.setPeso(54);
		
		//DIA
		//Declara��o, Instancia��o, Atribui��o
		Pessoa jose = new Pessoa("Jos� de Alencar",33,-92,1.75);
		//jose.nome = "Jos� de Alencar";
		jose.setNome("Jos� de Alencar");
		jose.setAltura(1.75);
		jose.setPeso(-92);
		jose.setIdade(32);
		
		
		System.out.println(maria.getNome() + ", IMC=" + maria.getIMC());
		System.out.println(jose.getNome() + ", IMC=" + jose.getIMC());
		
	}

}