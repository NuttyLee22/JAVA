package bebidas;


public abstract class BebidasQuentes {
		
	final void prepareRecipe() {
		adicionaBebidaAlcolica();
		ferveBebidaAlcolica();
		adicionaCondimentos();
		porNoCopo();
		promocaoHook();
	}
	
	abstract void promocaoHook();
	
	abstract void ferveBebidaAlcolica();
	
	abstract void adicionaBebidaAlcolica();
	
	abstract void adicionaCondimentos();
		
	void porNoCopo() {
		System.out.println("Pondo no copo");
	}
}

