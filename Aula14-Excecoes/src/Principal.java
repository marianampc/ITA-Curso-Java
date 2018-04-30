
public class Principal {

	public static void main(String[] args) throws Exception {
		a(-100);
		System.out.println("Terminando Execu��o de main()");
	}
	
	public static void a(int i) {
		System.out.println("Executando a() com +"+i);
		try {
			b(i);
		} catch (Exception e) {
			System.out.println("Tratando a exe��o: "+e.getMessage());
		}
		System.out.println("Terminando Execu��o de a()");
	}
	
	public static void b(int i) throws Exception {
		System.out.println("Executando b() com +"+i);
		if(i>0)
			throw new Exception("mensagem");
		System.out.println("Terminando Execu��o de b()");//Nunca deixara chegar aqui sem o if
	}

}
