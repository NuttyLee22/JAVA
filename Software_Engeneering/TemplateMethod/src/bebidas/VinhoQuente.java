package bebidas;


public class VinhoQuente extends BebidasQuentes {
	
	@Override
	void ferveBebidaAlcolica() {
		System.out.println("Fervendo Vinho");
		
	}
	
	@Override
	void adicionaBebidaAlcolica() {
		System.out.println("Adicionando Vinho");
		
	}

	@Override
	void adicionaCondimentos() {
		System.out.println("Adicionando Frutas");
		System.out.println("Adicionando Açucar");
	}

	@Override
	void promocaoHook() {
		System.out.println("Adicionando mais frutas e vinho no copão da promoção");
		
	}


}

