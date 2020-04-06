package aula20200327.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteComCarro {

	// 1. O Carro consuma 250ml de combustível sempre que for ligado ou acelerado.
	@Test
	void testarConsumo() {
		Carro golfRPZ1341 = new Carro(0);
		Carro onixBAH8712 = new Carro(0);

		onixBAH8712.abastecer(15.00);
		onixBAH8712.ligar();
		assertEquals(14.75, onixBAH8712.getCombustivelNoTanqueEmLitros());

		onixBAH8712.acelerar();
		onixBAH8712.acelerar();
		onixBAH8712.acelerar();
		assertEquals(14, onixBAH8712.getCombustivelNoTanqueEmLitros());

		golfRPZ1341.abastecer(1.00);
		golfRPZ1341.ligar();
		assertEquals(0.750, golfRPZ1341.getCombustivelNoTanqueEmLitros());

		golfRPZ1341.acelerar();
		assertEquals(0.500, golfRPZ1341.getCombustivelNoTanqueEmLitros());

	}

	// 2. O Carro se desligue automaticamente sempre que o combustível
	// no tanque seja insuficiente para seu funcionamento.
	@Test
	void testeAcabandoCombustivel() {
		Carro saveiroLOL8756 = new Carro(0);
		saveiroLOL8756.abastecer(1.25);
		saveiroLOL8756.ligar();
		saveiroLOL8756.acelerar();
		saveiroLOL8756.acelerar();
		saveiroLOL8756.acelerar();
		saveiroLOL8756.acelerar();
		saveiroLOL8756.acelerar();
		assertEquals(false, saveiroLOL8756.isDesligado());

		Carro unoTOP1234 = new Carro(0);
		unoTOP1234.abastecer(1.00);
		unoTOP1234.ligar();
		unoTOP1234.desligar();
		unoTOP1234.ligar();
		unoTOP1234.desligar();
		unoTOP1234.ligar();
		unoTOP1234.desligar();
		unoTOP1234.ligar();
		unoTOP1234.desligar();
		assertEquals(false, unoTOP1234.isDesligado());
	}
	// 3. O Casso possa ser reabastecido.

	@Test
	void carroSendoReabastecido() {
		Carro hiluxLEK6576 = new Carro(0);
		Carro meriva = new Carro(0);
		
		hiluxLEK6576.abastecer(5.00);
		assertEquals(5,hiluxLEK6576.getCombustivelNoTanqueEmLitros());
		
		meriva.abastecer(8.00);
		assertEquals(8,meriva.getCombustivelNoTanqueEmLitros());
		
		hiluxLEK6576.ligar();
		hiluxLEK6576.acelerar();
		hiluxLEK6576.acelerar();
		hiluxLEK6576.acelerar();
		hiluxLEK6576.desligar();
		hiluxLEK6576.abastecer(10);
		assertEquals(14,hiluxLEK6576.getCombustivelNoTanqueEmLitros());
		
		meriva.ligar();
		meriva.acelerar();
		meriva.desligar();
		meriva.abastecer(20);
		assertEquals(27.5,meriva.getCombustivelNoTanqueEmLitros());
	}

	//4. O Carro possa ser criado com uma quantidade determinada de combustível (via construtor).
	@Test
	void combustivelComConstruct() {
		Carro fuscaOPA6787 = new Carro(15);
		assertEquals(15,fuscaOPA6787.getCombustivelNoTanqueEmLitros());
	
		fuscaOPA6787.ligar();
		fuscaOPA6787.acelerar();
		fuscaOPA6787.desligar();
		fuscaOPA6787.abastecer(15);
		assertEquals(29.5,fuscaOPA6787.getCombustivelNoTanqueEmLitros());
		
		Carro audiKLK0978 =  new Carro(22);
		assertEquals(22,audiKLK0978.getCombustivelNoTanqueEmLitros());
		
		audiKLK0978.ligar();
		audiKLK0978.acelerar();
		audiKLK0978.acelerar();
		audiKLK0978.acelerar();
		audiKLK0978.desligar();
		audiKLK0978.abastecer(9);
		assertEquals(30,audiKLK0978.getCombustivelNoTanqueEmLitros());
		
		
	}
	
	@Test
	void testarEsvaziamentoTanque() {
		Carro opala =  new Carro(10);
		
		opala.ligar();
		opala.acelerar();
		opala.desligar();
		opala.esvaziarTanque();
		assertEquals(0,opala.getCombustivelNoTanqueEmLitros());
		
		opala.abastecer(5);
		opala.esvaziarTanque();
		assertEquals(0,opala.getCombustivelNoTanqueEmLitros());
		
	}
	
	
	
}




