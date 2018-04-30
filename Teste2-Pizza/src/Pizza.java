import java.util.HashMap;

public class Pizza {
	
	 static HashMap<Integer, String> Pedido = new HashMap<Integer, String>(); //O Integer será qual o Quantos ingredientes e a String o nome deles
	 static Integer NumeroIngr =0 ; //A quantidade de ingredientes nessa pizza
	 
	 void adicionarIngrediente(String ingrediente) {
		 NumeroIngr ++;
		 if(NumeroIngr == 0) {
			 System.out.println("Para realizar o pedido deve-se inserir um ingrediente.");
		 }else {
		 contabilizaIngrediente(ingrediente);
		 }
	 }
	
	int getPreco() {
		if (Pedido.size() <= 2) {
			return 15;
		}
		else if (Pedido.size() <= 5) {
			return 20;
		}
		else {
			return 23;
		}
	}
	static void contabilizaIngrediente(String ingrediente) {
		Pedido.put(NumeroIngr, ingrediente); //Criamos a lista de ingredientes
	}
	
	static void inicializar() { //O método estático para usar no teste
		Pedido.clear();
		NumeroIngr = 0;
	}

}
