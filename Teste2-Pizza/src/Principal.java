
public class Principal {

	public static void main(String[] args) {
		Pizza p1 =new Pizza();
		Pizza p2 =new Pizza();
		Pizza p3 =new Pizza();
		
		p1.adicionarIngrediente("queijo");
		p2.adicionarIngrediente("queijo");
		p3.adicionarIngrediente("queijo");
		
		p1.adicionarIngrediente("presunto");
		p2.adicionarIngrediente("palmito");
		p3.adicionarIngrediente("presunto");
		
		p1.adicionarIngrediente("Tomate");
		p2.adicionarIngrediente("Ovo");
		p3.adicionarIngrediente("presunto");
		
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionarCarrinho(p1);
		c1.adicionarCarrinho(p2);
		c1.adicionarCarrinho(p3);
		int pt = c1.valorTotal();
		System.out.println("O valor total é +"+pt);

	}

}
