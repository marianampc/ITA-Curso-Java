//Nome: Mariana Martins Pessoa Costa

public class Produto {
	private int código;
	private String Nome;
	private double preço;
	
	public Produto(int código,String nome,double preço) {
		this.código=código;
		this.Nome = nome;
		this.preço = preço;
	}
	//Até aqui criamos e instanciamos os atributos da classe produto
	//Os métodos equals(),hashVode() e toString são da classe Object
	//Caso queiram : https://www.devmedia.com.br/java-object-class-entendendo-a-classe-object/30513
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + código;
		long temp;
		temp = Double.doubleToLongBits(preço);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Produto other = (Produto) obj;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (código != other.código)
			return false;
		return true;
	}
	
	public int getCódigo() {
		return código;
	}

	public String getNome() {
		return Nome;
	}

	public double getPreço() {
		return preço;
	}
}
