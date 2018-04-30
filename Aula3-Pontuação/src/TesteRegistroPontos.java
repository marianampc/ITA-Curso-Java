import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteRegistroPontos {

	@Test
	public void pontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPonto rp = new RegistroPonto(cb);
		rp.criarTopico(u);
		assertEquals(u.pontos, 5);
	}
	
	@Test
	public void pontosCriarTopicoVIP() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip =true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPonto rp = new RegistroPonto(cb);
		rp.criarTopico(u);
		assertEquals(u.pontos, 25);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia =3;
		RegistroPonto rp = new RegistroPonto(cb);
		rp.criarTopico(u);
		assertEquals(u.pontos, 15);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDiaVIP() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia =2;
		RegistroPonto rp = new RegistroPonto(cb);
		rp.criarTopico(u);
		assertEquals(u.pontos, 50);
	}

}
