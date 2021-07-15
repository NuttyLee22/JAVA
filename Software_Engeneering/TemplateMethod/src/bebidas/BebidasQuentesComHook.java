package bebidas;

public abstract class BebidasQuentesComHook {

	final void prepareRecipe() {
		adicionaBebidaAlcolica();
		ferveBebidaAlcolica();
		porNoCopo();
		if (clienteQuerCondimentos()) {
			adicionaCondimentos();
		}
		if(clienteQuerPromocao()) {
			promocaoHook();
		}
	}
	
	abstract void adicionaBebidaAlcolica();
	
	abstract void adicionaCondimentos();
	
	abstract void promocaoHook();
	
	void ferveBebidaAlcolica() {
		System.out.println("Fervendo bebida");
	}
	
	void porNoCopo() {
		System.out.println("Colocando no copo");
	}
	
	boolean clienteQuerCondimentos() {
		return true;
	}
	
	boolean clienteQuerPromocao() {
		return true;
	}
}
