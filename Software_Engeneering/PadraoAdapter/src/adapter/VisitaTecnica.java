package adapter;

public class VisitaTecnica {
	private String destino;
	private String data;
	private String interesse;
	
	public VisitaTecnica() {}
	
	public VisitaTecnica(String destino, String data, String interesse) {
		this.destino = destino;
		this.data = data;
		this.interesse = interesse;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getInteresse() {
		return interesse;
	}
	
	public void setInteresse(String interesse) {
		this.interesse = interesse;
	}
	
	
}

