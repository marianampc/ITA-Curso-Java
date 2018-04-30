
public class Respeitoso implements FormatadorNome {

	private String sexo;
	
	
	public Respeitoso(String sexo) {
		super();
		this.sexo = sexo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(sexo == "Feminino") {
			return "Sra."+sobrenome;
		}else {
			return "Sr."+sobrenome;
		}
	}

}
