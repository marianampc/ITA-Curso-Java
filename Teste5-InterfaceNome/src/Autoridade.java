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
	
	//Métodos get para os atributos
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	
	//Instância de Formatador de Nome
	private FormatadorNome formatar;
	
	//O método getTratamento: Delegar a formatação do nome para a instância de Formatador de Nome
	public  String getTratamento() {
		return formatar.formatarNome(nome, sobrenome);
	}
}
