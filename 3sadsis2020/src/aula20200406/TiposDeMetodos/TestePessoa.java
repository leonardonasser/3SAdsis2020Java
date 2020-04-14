package aula20200406.TiposDeMetodos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestePessoa {

	/*
	 * 1. O nome não poder ser nulo, não pode ser vazio nem pode ter só uma letra.
	 * 2. A altura não pode ser menor que 25cm.
	 */

	@Test
	void testarSettersEGetters() {
		Pessoa p1 = new Pessoa(null,18,62,1.80);
		p1.setNome(null);
		p1.setIdade(18);
		p1.setAltura(1.80);
		p1.setPeso(62);

		assertEquals(null, p1.getNome());
		assertEquals(18, p1.getIdade());
		assertEquals(1.80, p1.getAltura());
		assertEquals(62, p1.getPeso());
		
		assertEquals(19.1358024691358, p1.getIMC());

		Pessoa p2 = new Pessoa("Julia",16,52,1.62);
		p2.setNome("Julia");
		p2.setIdade(16);
		p2.setAltura(1.62);
		p2.setPeso(52);

		assertEquals("Julia", p2.getNome());
		assertEquals(16, p2.getIdade());
		assertEquals(1.62, p2.getAltura());
		assertEquals(52, p2.getPeso());
		
		assertEquals(19.81405273586343, p2.getIMC());

	}

	@Test
	void testarComConstruct() {
		Pessoa p1 = new Pessoa("Ronaldo",29,110,1.82);
		assertEquals("Ronaldo", p1.getNome());
		assertEquals(29, p1.getIdade());
		assertEquals(1.82, p1.getAltura());
		assertEquals(110, p1.getPeso());
		
		assertEquals(33.20854969206617, p1.getIMC());

		Pessoa p2 = new Pessoa("Janaina",19,78,1.72);
		assertEquals("Janaina", p2.getNome());
		assertEquals(19, p2.getIdade());
		assertEquals(1.72, p2.getAltura());
		assertEquals(78, p2.getPeso());
		assertEquals(26.365603028664147, p2.getIMC());
	}

}
