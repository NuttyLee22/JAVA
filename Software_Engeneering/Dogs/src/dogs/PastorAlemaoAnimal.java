package dogs;

public class PastorAlemaoAnimal extends Animal{

	public PastorAlemaoAnimal() {
		
		compLatir = new LatirBrincadeira();
		compPular = new PularAlto();
	}
	
	@Override
	void mostrarCachorro() {
		System.out.println("Eu sou um Pastor Alemao");
		
	}
}
