import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class Testes {
	@Test
	void testProduto() {
		Produto p1 = new Produto(1,"tenis",200);
		Produto p2 = new Produto(1,"calça",50);
		
		assertEquals(p1.getCódigo(),p2.getCódigo());
		assertNotEquals(p1.getPreço(),p2.getPreço());
		assertFalse(p1.equals(p2));
	}
	
	@Test
	void testProdutoComTamanho() {
		ProdutoComTamanho p1 = new ProdutoComTamanho(1,"tenis",200,3);
		ProdutoComTamanho p2 = new ProdutoComTamanho(1,"calça",50,6);
		
		assertEquals(p1.getCódigo(),p2.getCódigo());
		assertNotEquals(p1.getPreço(),p2.getPreço());
		assertNotEquals(p1.getTamanho(),p2.getTamanho());
		assertFalse(p1.equals(p2));
	}
	
	@Test
	void testCarrinhoDeProdutos() {
		Produto p1 = new Produto(1,"tenis",200);
		Produto p2 = new Produto(1,"calça",50);
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaProduto(p1, 2);
		c1.adicionaProduto(p2, 1);
		assertEquals(c1.quantidadeTotal,3);
		assertEquals(c1.valorTotal(),6);
		c1.removeProduto(p1, 1);
		assertEquals(c1.quantidadeTotal,2);
	}
}
