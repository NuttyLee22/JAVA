
public class App {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Joao";
		aluno1.media = 8;
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Jose";
		aluno2.media = 2;
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Niko";
		aluno3.media = 4;
		
		if(aluno1.temMaiorMedia(aluno2) && aluno1.temMaiorMedia(aluno3)) {
			System.out.println(aluno1.nome+" tem maior media "+aluno1.media);
			
		}else if(aluno2.temMaiorMedia(aluno1) && aluno2.temMaiorMedia(aluno3)) {
			System.out.println(aluno2.nome+" tem maior media "+aluno2.media);
		}else {
			System.out.println(aluno3.nome+" tem maior media "+aluno3.media);
		}
	}
}
