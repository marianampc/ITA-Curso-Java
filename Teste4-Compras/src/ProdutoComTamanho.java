
public class ProdutoComTamanho extends Produto {

	private int tamanho; //Estou criando a v�riavel diferente da classe Produto
	
	public ProdutoComTamanho(int c�digo, String nome, double pre�o,int tamanho ) {
		super(c�digo, nome, pre�o);
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
		if (tamanho != other.tamanho && getC�digo() !=other.getC�digo())
			return false;
		return true;
	}
	public int getTamanho() {
		return this.tamanho;
	}
}
