
public class Carro {
	int potencia;
	int velocidade;
	String nome;
	//Esses tr�s s�o Pacotes,M�todos,Tipos e Atributos da classe Carro
	
	//Carro(int potencia){ //N�o precisa definir um retorno, e sempre tem o mesmo nome da class
	//	this.potencia =potencia;
	//	velocidade =0;
	//}//Esse aqui � um construtor
	
	void acelerar() { //Esse � um m�todo
		velocidade += potencia;
	}	
	void frear() {
		velocidade = velocidade / 2;
	}
	int getVelocidade() {
		return velocidade;
	}
	void imprimir() {
		System.out.println("O carro "+nome+" est� a velocidade de "+getVelocidade()+" Km/h");
	}
}
