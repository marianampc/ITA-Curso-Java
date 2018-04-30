import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteContaEspecial extends TesteContaCorrente {

	@Before
	public void inicializaConta() {
		cc = new ContaEspecial(100);
		cc.depositar(200);
	}
	
	@Test
	public void saqueMaiorQueSaldo() {
		//ContaCorrente cc = new ContaCorrente();
		//cc.depositar(200);
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo,200);
		assertEquals(valorSacado,0);
	}

}
