//Mariana Martins Pessoa Costa

public class Autoridade{
	
	//Os atributos
	private String nome;
	private String sobrenome;
	
	//Expecificando os mesmos
	public Autoridade(String nome, String sobrenome,FormatadorNome f) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatar = f;
	}
	
	//M�todos get para os atributos
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	
	//Inst�ncia de Formatador de Nome
	private FormatadorNome formatar;
	
	//O m�todo getTratamento: Delegar a formata��o do nome para a inst�ncia de Formatador de Nome
	public  String getTratamento() {
		return formatar.formatarNome(nome, sobrenome);
	}
}
