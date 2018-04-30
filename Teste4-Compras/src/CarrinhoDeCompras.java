import java.util.HashMap;

public class CarrinhoDeCompras {

	 static HashMap<Integer, String> Produtos = new HashMap<Integer, String>(); //O Integer será quantos produtos, enquanto isso a string será o ome do produto
	 public int quantidadeTotal;
	 public void adicionaProduto(Produto px,int quantidade) {
				if(Produtos.hashCode() == px.hashCode()){
					quantidade+=1;
					}
		 this.quantidadeTotal += quantidade ;
		 Produtos.put(px.getCódigo(),px.getNome());
	 }
	 
	 public void  removeProduto(Produto px,int quantidade) {
		 for(int i=0; i > quantidade; i++) {
				if(Produtos.hashCode() == px.hashCode()){
					Produtos.remove(px.getCódigo(),px.getNome());
					quantidade=-quantidade;
				}
		}
		 this.quantidadeTotal -= quantidade ;
	 }
	 
	 public int valorTotal() {
		 int Total=0;
			for(int i=0; i != Produtos.size(); i++) {
				Total = Total + quantidadeTotal*2;//Cada produto custara 2 reais(Por fim dos testes)
			}
			return Total;
	 }
}
