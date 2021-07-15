package dogs;

public abstract class Animal {
	comportamentoLatir compLatir;
	comportamentoPular compPular;
	
	public Animal() {
	}
	
	public void setcomportamentoLatir(comportamentoLatir cl) {
		 compLatir = cl;
	}
	
	public void setcomportamentoPular(comportamentoPular cp) {
		 compPular = cp;
	}
	
	abstract void mostrarCachorro();
	
	public void performLatir() {
		compLatir.latir();
	}
	
	public void performPular() {
		compPular.pular();
	}
}
