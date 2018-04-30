
public class ContaEspecial extends ContaCorrente {
	
	int limite;
	
	//Vou criar um construtor
	ContaEspecial(int limite){
		this.limite = limite;//O limite que recebermos será o que usaremos
	}
	//Estamos sobreescrevendo o método da subclasse
	public int sacar(int valor) {
		if(valor > (saldo + limite)  ) {
			return 0;
		}else {
			saldo -= valor;
			return valor;
		}
	}

}
