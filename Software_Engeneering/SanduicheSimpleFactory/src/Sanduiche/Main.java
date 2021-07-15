package Sanduiche;

public class Main {

	public static void main(String[] args) {	
		SimplesSanduicheFactory Fabrica = new SimplesSanduicheFactory();
		SanduicheStore Lanchonete = new SanduicheStore(Fabrica);
		
		Sanduiche sanduiche = Lanchonete.orderSanduiche("Barbecue");
		System.out.println("----Ingredientes pedidos no sanduiche---- "+"\n\n"+sanduiche);
		
	}
}