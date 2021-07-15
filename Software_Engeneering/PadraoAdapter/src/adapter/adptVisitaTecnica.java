package adapter;

public class adptVisitaTecnica extends VisitaTecnica implements IDados{

	public adptVisitaTecnica(String destino, String data, String interesse) {
		super(destino, data, interesse);
	}
	
	@Override
	public String getDados() {
		System.out.println("-- Visita técnica --");

		return getDestino();
	}
}
