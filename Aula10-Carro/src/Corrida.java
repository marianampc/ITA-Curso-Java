import java.util.HashMap;
import java.util.Map;

public class Corrida {
	
	private int pista;
	private Map<CarroDeCorrida, Integer> carros = new HashMap<>();
	//O mapa é uma estrutura com uma chave e um valor, o interger será a distancia percorrida
	
	public Corrida(int tamanho) {
		pista = tamanho;
	}
	
	public void adicionaCarro(CarroDeCorrida carro) {
		carros.put(carro, 0);
	}
	
	private boolean terminou(){
		for(Integer valor: carros.values()) {
			if(valor >= pista) {
				return true;
			}
		}
		return false;
	}
	
	public void umDoisTresEJa() {
		while(! terminou()){
			//Isso aqui é um ciclo da corrida
			for(CarroDeCorrida carro : carros.keySet()) {
				carro.acelerar();
				int distancia = carros.get(carro);
				distancia +=carro.getVelocidade();
				carros.put(carro, distancia);
			}	
		}
		for(CarroDeCorrida carro : carros.keySet()) {
			System.out.println(carro.getNome()+" - "+carros.get(carro));
		}	
		
		
	}
}
