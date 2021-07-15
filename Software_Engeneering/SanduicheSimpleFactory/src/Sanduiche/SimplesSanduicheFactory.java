package Sanduiche;

public class SimplesSanduicheFactory {

	public Sanduiche createSanduiche(String TipoSanduiche) {
		Sanduiche sanduiche = null;
		if(TipoSanduiche.equals("Mostarda")) {
			sanduiche = new XBacon();
		}else
			if(TipoSanduiche.equals("Maionese")) {
			sanduiche = new XEgg();
		}else
			if(TipoSanduiche.equals("Ketchup")) {
				sanduiche = new XSalada();
		}else
			if(TipoSanduiche.equals("Barbecue")) {
				sanduiche = new XTudo();
		}else
			if(TipoSanduiche.equals("Maionese temperada")) {
				sanduiche = new Natural();
		}else {
			System.out.println("Desculpe, n�o temos isso no nosso card�pio.");
		}
		return sanduiche;
		
	}
}