package Singleton;

public class Impressora {

	private boolean papel;
	private boolean magenta;
	private boolean ciano;
	private boolean black;
	private boolean yellow;
	
	private static Impressora uniqueInstance;
	
	private Impressora() {
		papel = true;
		magenta = false;
		ciano = true;
		black = true;
		yellow = false;
	}
	
	public static Impressora getInstance() {
		if(uniqueInstance == null) {
			System.out.println("Gerando arquivo para impressão -__- \n");
			uniqueInstance = new Impressora();
		}
		System.out.println("Imprimindo arquivo :p");
		return uniqueInstance;
	}
	
	public boolean isMagenta() {
		return magenta;
	}
	
	public boolean isPapel() {
		return papel;
	}
	
	public boolean isYellow() {
		return yellow;
	}
	
	public boolean isBlack() {
		return black;
	}
	
	public boolean isCiano() {
		return ciano;
	}
}
