
public class ComTítulo implements FormatadorNome {
	private String titulo;
	
	
	public ComTítulo(String titulo) {
		super();
		this.titulo = titulo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return titulo+" "+nome+" "+sobrenome;
	}

}
