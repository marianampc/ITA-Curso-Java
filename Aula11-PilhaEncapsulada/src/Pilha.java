
public class Pilha {
	
	private Object[] elementos;
	private int topo=0;
	
	public Pilha(int maximo) {
		elementos = new Object[maximo];
	}
	
	public Object[] getElementos() {
		return elementos;
	}

	public void setElementos(Object[] elementos) {
		this.elementos = elementos;
	}

	public void setTopo(int topo) {
		this.topo = topo;
	}

	public void empilar(Object elemento) {
		elementos[topo] = elemento;
		topo++;
	}
	
	public Object desempilhar() {
		topo--;
		return elementos[topo];
	}
	
	public Object topo() {
		return elementos[topo-1];
	}
	
	public int tamanho() {
		return topo;
	}

}
