
public class ProdutoComTamanho extends Produto {

	private int tamanho; //Estou criando a váriavel diferente da classe Produto
	
	public ProdutoComTamanho(int código, String nome, double preço,int tamanho ) {
		super(código, nome, preço);
		this.tamanho = tamanho;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + tamanho;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (tamanho != other.tamanho && getCódigo() !=other.getCódigo())
			return false;
		return true;
	}
	public int getTamanho() {
		return this.tamanho;
	}
}
