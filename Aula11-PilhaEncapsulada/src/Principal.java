
public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha(10);
		p.empilar("Eduardo");
		p.empilar("Maria");
		p.empilar("Jos�");
		
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		//p.setTopo(6);
		
		//Desempilhando
		System.out.println("-------------");
		System.out.println(p.desempilhar().toString().toUpperCase());
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
	}

}
