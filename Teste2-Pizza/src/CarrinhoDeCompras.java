import java.util.ArrayList;

public class CarrinhoDeCompras {
	ArrayList<Pizza>px = new ArrayList<Pizza>(); //Ser� uma lista de Pizzas que est� no meu carrinho
	
	public void adicionarCarrinho(Pizza pn) { //Adicionamos a pizza no carrinho, ou seja no conjunto
		if(Pizza.NumeroIngr == 0) {
			System.out.println("N�o podemos adicionar uma Pizza sem Ingredientes");
			return;
		}else {
		px.add(pn);
		}
	}
	int valorTotal() { //Pegaremos o valor total de todas as pizzas recebidas
		int Total=0;
		for(int i=0; i != px.size(); i++) {
			Total = Total+px.get(i).getPreco();//Vai passando por cada elemento do array at� Terminar e soma no valor
		}
		return Total;
	}
	
}
