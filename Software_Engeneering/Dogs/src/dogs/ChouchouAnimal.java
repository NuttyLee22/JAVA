package dogs;

public class ChouchouAnimal extends Animal{

	public ChouchouAnimal() {
		
		compLatir = new LatirBrincadeira();
		compPular = new PularBaixo();
	}

	@Override
	void mostrarCachorro() {
		System.out.println("Eu sou um Chouchou");
		
	}
}
