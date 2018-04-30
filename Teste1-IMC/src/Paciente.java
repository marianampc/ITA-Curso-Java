/* Nome: Mariana Martins Pessoa costa
 * Excercio da primeira semana do curso
 * Objetivo: Criar uma classe para receber as responsabilidade do paciente
 * */

public class Paciente { 
	double peso,altura; //Inicializei as variáveis
	double IMC;
	Paciente(double p,double a){ 
		this.peso = p;
		this.altura =a;
	}//Esse aqui é um construtor que recebe o peso e a altura
	
	void calcularIMC() { //Método para calcular o IMC
		IMC = peso/(altura*altura);
	}
	String diagnostico() {
		calcularIMC();
		if(IMC < 16) {
			return "Baixo peso muito grave.";
		}else if(IMC < 16.99){
			return "Baixo peso grave.";
		}else if(IMC < 18.49){
			return "Baixo peso.";
		}else if(IMC < 24.99){
			return "Peso normal.";
		}else if(IMC < 29.99){
			return "Sobrepeso.";
		}else if(IMC < 34.99){
			return "Obesidade grau I.";
		}else if(IMC < 39.99){
			return "Obesidade grau II.";
		}else {
			return "Obesidade grau III.";
		}
	}
}
