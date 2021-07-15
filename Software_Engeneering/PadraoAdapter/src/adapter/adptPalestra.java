package adapter;

public class adptPalestra extends Palestra implements IDados{
	
	public adptPalestra(String assunto, String palestrante, String data) {
		super(assunto, palestrante, data);
	}
	
	@Override
	public String getDados() {
		System.out.println("-- Palestra --");

		return this.getAssunto();
	}
}
