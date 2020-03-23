package cofre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesComCofre {

	@Test
	void testarCofre() {
		Cofre cofreBanco = new Cofre();
		cofreBanco.abrir();
		assertEquals(true, cofreBanco.isAberto());

		Cofre cofreSala = new Cofre();
		cofreSala.fechar();
		assertEquals(false, cofreSala.isAberto());
	}
	
	@Test
	void testarCofreSeguro() {
		CofreSeguro cofreBancoSafe = new CofreSeguro();
		cofreBancoSafe.setSenhacofre(654321);
		cofreBancoSafe.abrir(654321);
		assertEquals(true,cofreBancoSafe.isAberto());
		
		CofreSeguro cofreSalaSafe =  new CofreSeguro();
		cofreSalaSafe.setSenhacofre(123456);
		cofreSalaSafe.abrir(123456);
		assertEquals(true,cofreSalaSafe.isAberto());
		
		cofreSalaSafe.fechar();
		assertEquals(false,cofreSalaSafe.isAberto());
		
		
	}
	

}
