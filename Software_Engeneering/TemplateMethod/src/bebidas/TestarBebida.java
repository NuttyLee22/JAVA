package bebidas;


public class TestarBebida {
	public static void main(String[] args) {
		
		Quentao quentao = new Quentao();
		VinhoQuente vinhoQuente = new VinhoQuente();
		
		System.out.println("\nPreparando Quentão... ");
		quentao.prepareRecipe();
		
		System.out.println("\nPreparando Vinho Quente... ");
		vinhoQuente.prepareRecipe();
		
		QuentaoComHook quentaoHook = new QuentaoComHook();
		VinhoQuenteComHook vinhoHook = new VinhoQuenteComHook();
		
		System.out.println("\nPreparando seu Quentão... ");
		quentaoHook.prepareRecipe();
		
		System.out.println("\nPreparando Vinho Quente... ");
		vinhoHook.prepareRecipe();
	}
}

