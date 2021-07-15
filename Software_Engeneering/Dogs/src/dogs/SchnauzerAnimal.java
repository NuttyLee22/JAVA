package dogs;

public class SchnauzerAnimal extends Animal{

	public SchnauzerAnimal() {
		
		compLatir = new LatirBravo();
		compPular = new PularAlto();
	}
	
	@Override
	void mostrarCachorro() {
		System.out.println("Eu sou um Schnauzer");
		
	}
}
