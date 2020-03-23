package cofre;

public class AppCofre {

	public static void main(String[] args) {

		Cofre cofreDaSala = new Cofre();
		Cofre cofreDoBanco = new Cofre();

		cofreDaSala.fechar();
		cofreDoBanco.abrir();

		System.out.println("Da sala: " + cofreDaSala.isAberto());
		System.out.println("Do Banco: " + cofreDoBanco.isAberto());
		;

	}

}
