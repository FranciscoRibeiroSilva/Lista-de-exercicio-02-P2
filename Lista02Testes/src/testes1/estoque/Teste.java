package testes1.estoque;

import static org.junit.Assert.*;
import org.junit.Test;

import questao.estoque.Estoque;


public class Teste {
	
	
	Estoque esto = new Estoque();
	
	@Test
	public void testeNome() {
		
		esto.setNome("Gás");
		assertTrue(esto.getNome() == "Gás");
		
	}
	
	@Test
	public void testeFalseNome() {
		
		esto.setNome("Gás");
		assertFalse(esto.getNome() != "Gás");
		
	}
	
	@Test
	public void testeMinima() {
		esto.setQtdMinima(1);
		assertTrue(esto.getQtdMinima() == 1);
	}
	
	@Test
	public void testRepor() {
		
		esto.repor(1);
		assertTrue(esto.getQtdAtual() == 1);
	}
	
	@Test
	public void testBaixa() {
		esto.repor(1);
		esto.darBaixa(1);
		assertTrue(esto.getQtdAtual() == 0);
		
	}
	
	@Test
	public void testReposi() {
		esto.setAtua(0);
		esto.setQtdMinima(1);
		assertTrue(esto.precisaRepor() == true);
	}

}
