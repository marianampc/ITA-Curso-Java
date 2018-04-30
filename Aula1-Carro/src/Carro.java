
public class Carro {
	int potencia;
	int velocidade;
	String nome;
	//Esses três são Pacotes,Métodos,Tipos e Atributos da classe Carro
	
	//Carro(int potencia){ //Não precisa definir um retorno, e sempre tem o mesmo nome da class
	//	this.potencia =potencia;
	//	velocidade =0;
	//}//Esse aqui é um construtor
	
	void acelerar() { //Esse é um método
		velocidade += potencia;
	}	
	void frear() {
		velocidade = velocidade / 2;
	}
	int getVelocidade() {
		return velocidade;
	}
	void imprimir() {
		System.out.println("O carro "+nome+" está a velocidade de "+getVelocidade()+" Km/h");
	}
}
