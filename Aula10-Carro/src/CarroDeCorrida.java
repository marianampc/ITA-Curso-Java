
public abstract class CarroDeCorrida{

	protected int velocidade;
	protected int velocidadeMAX;
	protected String nome;
	
	public CarroDeCorrida(String nome, int velocidadeMAX) {
		//super();
		this.nome = nome;
		this.velocidadeMAX = velocidadeMAX;
		this.velocidade = 0;
	}
	
	public abstract void acelerar();

	public void frear() {
		velocidade = velocidade / 2;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public String getNome() {
		return nome;
	}

	
}
