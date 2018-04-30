import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

public class TesteAutenticador {

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("guerra", "senhadoguerra");
		assertEquals("guerra", u.getLogin());
	}
	
	@Test(expected= LoginException.class) 
	public void loginFalho() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("guerra", "senhaerradadoguerra");
	}

	@Test 
	public void InformacaoDoErro() {
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("guerra", "senhaerradadoguerra");
			fail();
		} catch (LoginException e) {
			assertEquals("guerra", e.getLogin());
		}
	}
}
