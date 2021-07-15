package Sanduiche;

public class SanduicheStore {
	SimplesSanduicheFactory Fabrica;
	
	public SanduicheStore(SimplesSanduicheFactory Fabrica) {
		this.Fabrica = Fabrica;
		
	}
	
	public Sanduiche orderSanduiche(String Pedido){
		Sanduiche sanduiche;
		sanduiche = Fabrica.createSanduiche(Pedido);

		return sanduiche;
	}

}
