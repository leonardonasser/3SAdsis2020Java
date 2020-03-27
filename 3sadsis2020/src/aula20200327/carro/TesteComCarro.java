package aula20200327.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteComCarro {

	@Test
	void test() {
		
		
		Carro onix = new Carro();
		onix.abastecer(3.00);
		onix.ligar();
		onix.acelerar();
		assertEquals(true, onix.isLigado());
		
		onix.desligar();
		assertEquals(false, onix.isDesligado());
		
		Carro bmw = new Carro();
		bmw.abastecer(1.00);
		bmw.ligar();
		bmw.acelerar();
		bmw.acelerar();
		bmw.acelerar();
		bmw.acelerar();
		bmw.acelerar();
		assertEquals(false,bmw.isDesligado());
		
		
		
	}

}
