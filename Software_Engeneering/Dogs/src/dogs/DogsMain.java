package dogs;

public class DogsMain {
	
	public static void main(String[] args) {
		 
		PincherAnimal pincher = new PincherAnimal();
		DobermannAnimal dobermann = new DobermannAnimal();
		PastorAlemaoAnimal pastorAlemao = new PastorAlemaoAnimal();
		SchnauzerAnimal schnauzer = new SchnauzerAnimal();
		ChouchouAnimal chouchou = new ChouchouAnimal();
		
		pincher.mostrarCachorro();
		pincher.performLatir();
		pincher.performPular();
		System.out.println(" ");
		dobermann.mostrarCachorro();
		dobermann.performLatir();
		dobermann.performPular();
		System.out.println(" ");
		pastorAlemao.mostrarCachorro();
		pastorAlemao.performLatir();
		pastorAlemao.setcomportamentoLatir(new LatirAtencao());
		pastorAlemao.performLatir();
		pastorAlemao.performPular();
		System.out.println(" ");
		schnauzer.mostrarCachorro();
		schnauzer.performLatir();
		schnauzer.performPular();
		System.out.println(" ");
		chouchou.mostrarCachorro();
		chouchou.performLatir();
		chouchou.performPular();

	}

}
