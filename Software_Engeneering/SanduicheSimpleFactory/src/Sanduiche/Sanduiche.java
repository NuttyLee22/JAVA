package Sanduiche;

public class Sanduiche {

	String bread;
	String sauce;
	String meat;
	String salad;
	
public String getSauce() {
	return sauce;
}	
	
	
	public String toString() {
		StringBuffer Cardapio = new StringBuffer();
		Cardapio.append("Pão: "+bread+"\n");
		Cardapio.append("Molho: "+sauce+"\n");
		Cardapio.append("Carne: "+meat+"\n");
		Cardapio.append("Salada: "+salad+"\n");
		
		
		return Cardapio.toString();
	}
}