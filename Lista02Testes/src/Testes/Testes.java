package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Questoes.com.br.Lampada;

public class Testes {

	Lampada luz = new Lampada();
	
	@Test
	public void testeLigar() {
		
		luz.setDesligar();
		assertTrue(luz.observa() == false);
	}
}
