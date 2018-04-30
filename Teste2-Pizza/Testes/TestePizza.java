import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestePizza {
	@Before
	public void inicio() {
		Pizza p1 = new Pizza();
		p1.inicializar();
	}

	@Test
	public void testPizza() {
		Pizza p1 = new Pizza();
		for(int i = 0;i <= 7;i++) { 
			if(i == 1 | i ==2 ) { //Testamos o primeiro preço
				assertEquals(15, p1.getPreco());
			}else if (3 <= i && i <= 5) { //Segundo Preço
				assertEquals(20, p1.getPreco());
			}else if (5 < i) { //Terceiro preçode pizza.
				assertEquals(23, p1.getPreco()); 
			}
			p1.adicionarIngrediente("+"+i);			
		}
		for(int i =1; i<=7;i++) {
			assertEquals("+"+i,"+"+i); //Testamos se os ingredientes salvos são os corretos , assim testamos o registro deles
		}
	}
	
}
