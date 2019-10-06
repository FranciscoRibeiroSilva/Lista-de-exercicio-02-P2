package banco.test;
import static org.junit.Assert.*;
import org.junit.Test;

import quest.banco.Conta;
public class Teste {

	Conta cont = new Conta("Por", 2222, "mind", 100, "1000 a.c");
	
	@Test
	public void testeSacar() {
		
		cont.setSacar(50);
		assertTrue(cont.getSaldo() == 50);
	}
	
	@Test
	public void testDepo() {
		
		cont.depositar(50);
		assertTrue(cont.getSaldo()==150);
	}
}
