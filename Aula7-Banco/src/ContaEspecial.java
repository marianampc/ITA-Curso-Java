
public class ContaEspecial extends ContaCorrente {
	
	int limite;
	
	//Vou criar um construtor
	ContaEspecial(int limite){
		this.limite = limite;//O limite que recebermos ser� o que usaremos
	}
	//Estamos sobreescrevendo o m�todo da subclasse
	public int sacar(int valor) {
		if(valor > (saldo + limite)  ) {
			return 0;
		}else {
			saldo -= valor;
			return valor;
		}
	}

}
