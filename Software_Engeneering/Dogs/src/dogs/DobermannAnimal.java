package dogs;

public class DobermannAnimal extends Animal{

	public DobermannAnimal() {
		
		compLatir = new LatirAtencao();
		compPular = new PularAlto();
	}
	
	@Override
	void mostrarCachorro() {
		System.out.println("Eu sou um Dobermann");
		
	}
}
