import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarro {
	@Test
	public void testParado() {
		Carro c = new Carro();
		assertEquals(0,c.velocidade);
	}
	
	@Test
	public void testAcelerar() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		assertEquals(10,c.velocidade);
	}
	
	@Test
	public void testFrer() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		c.frear();
		assertEquals(5,c.velocidade);
	}

}
