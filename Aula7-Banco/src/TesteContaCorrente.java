import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteContaCorrente  {

	ContaCorrente cc;
	
	@Before
	public void inicializaConta() {
		cc = new ContaCorrente();
		cc.depositar(200);
	}
	
	@Test
	public void deposito() {
		//ContaCorrente cc = new ContaCorrente();
		//cc.depositar(200);
		assertEquals(cc.saldo,200);
	}
	
	@Test
	public void saque() {
		//ContaCorrente cc = new ContaCorrente();
		//cc.depositar(200);
		int valorSacado = cc.sacar(50);
		assertEquals(150,cc.saldo);
		assertEquals(50,valorSacado);
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
