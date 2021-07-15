package dogs;

public class PincherAnimal extends Animal{

	public PincherAnimal() {
		
		compLatir = new LatirBravo();
		compPular = new PularBaixo();
	}
	
	@Override
	void mostrarCachorro() {
		System.out.println("Eu sou um Pincher");
		
	}
}
