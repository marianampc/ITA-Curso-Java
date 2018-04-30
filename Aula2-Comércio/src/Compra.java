
public class Compra {
	
	int valor_Total;
	int numeroParcelas;
	
	//a vista
	public Compra(int valor){
		valor_Total = valor;
		numeroParcelas =1;
	}
	
	//Parcelado
	public Compra(int qtdParcelas, int valorParcela) {
		numeroParcelas = qtdParcelas;
		valor_Total = valorParcela*qtdParcelas;
	}

	public int getValor_Total() {
		return valor_Total;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}
	
	public int getValorParcela(){
		return numeroParcelas;
	}

}
