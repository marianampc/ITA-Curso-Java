//Nome: Mariana Martins Pessoa Costa

public class Produto {
	private int c�digo;
	private String Nome;
	private double pre�o;
	
	public Produto(int c�digo,String nome,double pre�o) {
		this.c�digo=c�digo;
		this.Nome = nome;
		this.pre�o = pre�o;
	}
	//At� aqui criamos e instanciamos os atributos da classe produto
	//Os m�todos equals(),hashVode() e toString s�o da classe Object
	//Caso queiram : https://www.devmedia.com.br/java-object-class-entendendo-a-classe-object/30513
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + c�digo;
		long temp;
		temp = Double.doubleToLongBits(pre�o);
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
		if (c�digo != other.c�digo)
			return false;
		return true;
	}
	
	public int getC�digo() {
		return c�digo;
	}

	public String getNome() {
		return Nome;
	}

	public double getPre�o() {
		return pre�o;
	}
}
