
public class Aluno {

	String nome;
	double media;
	
	public boolean temMaiorMedia(Aluno outroAluno) {
		if(this.media > outroAluno.media) {
			return true;
		}else {
			return false;
		}
	}
}
