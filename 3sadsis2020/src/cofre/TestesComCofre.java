package cofre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesComCofre {

	@Test
	void testarCofre() {
		Cofre cofreBanco = new Cofre();
		cofreBanco.abrir();
		assertEquals(true, cofreBanco.isAberto());

		cofreBanco.fechar();
		assertEquals(false, cofreBanco.isAberto());	
		
		

		
		Cofre cofreSala = new Cofre();
		cofreSala.fechar();
		assertEquals(false, cofreSala.isAberto());


		cofreSala.abrir();
		assertEquals(true, cofreSala.isAberto());
		
	}
	
	@Test
	void testarCofreSeguro() {
		CofreSeguro cofreBancoSafe = new CofreSeguro(654321);
		cofreBancoSafe.abrir(654321);
		assertEquals(true,cofreBancoSafe.isAberto());
		
		cofreBancoSafe.fechar();
		assertEquals(false,cofreBancoSafe.isAberto());
		
		CofreSeguro cofreSalaSafe =  new CofreSeguro(123456);
		cofreSalaSafe.abrir(123456);
		assertEquals(true,cofreSalaSafe.isAberto());
		
		cofreSalaSafe.fechar();
		assertEquals(false,cofreSalaSafe.isAberto());
		
		
		
		
	}
	

}
