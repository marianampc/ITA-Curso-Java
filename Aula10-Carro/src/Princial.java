
public class Princial {

	public static void main(String[] args) {
		Corrida corridaDaAmizade = new Corrida(2000);
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroA",10,110));
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroB",8,130));
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroC",1.7,100));
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroD",1.4,150));
		corridaDaAmizade.umDoisTresEJa();

	}

}
