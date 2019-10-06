package Teste.quadrado;

import static org.junit.Assert.*;

import org.junit.Test;

import questao.quadrado.Quadrado;

public class Teste {
	
	Quadrado qq = new Quadrado(2);
	
	@Test
	public void testeArea() {
		assertTrue(qq.area() == 4);

	}
	
	@Test
	public void testeAreaFalse() {
		
		assertFalse(qq.area() == 0);
	}
	
	@Test
	public void testePerimentro() {
		
		assertTrue(qq.perimentro() == 8);
	}
	
	@Test 
	public void testeFalsePerimetro() {
		
		assertFalse(qq.perimentro() == 0);
	}
}