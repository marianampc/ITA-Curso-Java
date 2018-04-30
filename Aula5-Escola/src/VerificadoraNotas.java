
public class VerificadoraNotas {
	public static int mediaAluno(Aluno a) { //Ñão deveria ser necerario ter que perguntar para outra classe a nota do proprio aluno;
		int total =0;
		total +=a.bim1;
		total +=a.bim2;
		total +=a.bim3;
		total +=a.bim4;
		return total/4;
	}
	
	public static boolean passouAno(Aluno a) {
		int media = mediaAluno(a);
		if(media>=60) {
			return true;
		}
		return false;
	}

}
