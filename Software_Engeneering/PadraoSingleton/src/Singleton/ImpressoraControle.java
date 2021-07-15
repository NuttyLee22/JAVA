package Singleton;

public class ImpressoraControle {

	public static void main(String[] args) {
		Impressora tinta = Impressora.getInstance();
		tinta.isMagenta();
		tinta.isBlack();
		tinta.isCiano();
		tinta.isPapel();
		tinta.isYellow();
		
		System.out.println("Endereco de memoria: "+tinta+"\n");
		
		Impressora tinta2 = Impressora.getInstance();
		
		System.out.println("Endereco de memoria repetido: "+tinta2);
	}
}
