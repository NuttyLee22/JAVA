package bebidas;


public class Quentao extends BebidasQuentes {

	@Override
	void adicionaBebidaAlcolica() {
		System.out.println("Adicionando Corote");
		
	}
	
	@Override
	void ferveBebidaAlcolica() {
		System.out.println("Fervendo Corote");
		
	}

	@Override
	void adicionaCondimentos() {
		System.out.println("Adicionando Menta");
		System.out.println("Adicionando Canela");
	
	}

	@Override
	void promocaoHook() {
		System.out.println("Adicionando mais Corote ao quentão");
		System.out.println("Adicionando mais Canela ao quentão");
	}

}

