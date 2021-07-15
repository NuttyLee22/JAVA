package adapter;

public class adptEstagio extends Estagio implements IDados{
	
	public adptEstagio(String local, String cargo) {
		super(local, cargo);
	}
	
	@Override
	public String getDados() {
		System.out.println("-- Estagio --");
		return this.getCargo();
	}
}