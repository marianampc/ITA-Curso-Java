
public class RegistroPonto {
	private CalculadoraBonus bonus;
	
	public RegistroPonto(CalculadoraBonus cb) {
		bonus = cb;
	}
	public void fazerUmComentario(Usuario u) { //É um método 
		u.pontos +=3*bonus.bonus(u);
	}
	
	public void criarTopico(Usuario u){
		u.pontos +=5*bonus.bonus(u);
	}

	public void darUmLink(Usuario u) {
		u.pontos +=1*bonus.bonus(u);
	}
}
