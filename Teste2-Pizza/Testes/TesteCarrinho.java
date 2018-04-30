import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCarrinho {
	@Test
	public void testCarrinho() {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionarCarrinho(p1);
		assertEquals(c1.px.size(), 0);//Aqui testamos se ele irá adicionar uma pizza sem ingrediente
		for(int i=0;i<3;i++) { //Adicionamos os ingredientes nas pizzas 
			p1.adicionarIngrediente("+"+i);
			p2.adicionarIngrediente("+"+i);
			p3.adicionarIngrediente("+"+i);
		}
		c1.adicionarCarrinho(p1);
		c1.adicionarCarrinho(p2);
		c1.adicionarCarrinho(p3);
		assertEquals(60, c1.valorTotal());
		
	}

}
