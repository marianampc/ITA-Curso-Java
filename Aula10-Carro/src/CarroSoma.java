public class CarroSoma extends CarroDeCorrida{
	
	private double potencia;
	
	public CarroSoma(String nome, double d, int velocidadeMAX) {
		super(nome,velocidadeMAX);
		this.nome = nome;
		this.potencia = d;
	}
	
	public void acelerar() {
		velocidade += potencia;
		if(velocidade > velocidadeMAX) {
			velocidade = velocidadeMAX;
		}
	}
		
}
