package ExercicioObserver;

public class Principal {

	public static void main(String[] args) {
		DadosSubject dados = new DadosSubject();
		dados.attach(new TabelaObserver(dados));
		dados.attach(new PorcentoObserver(dados));
		dados.setState(new Dados(2, 1, 8));
		dados.setState(new Dados(9, 4, 3));
	}
}
