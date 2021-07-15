package adapter;

public class Palestra {
	private String assunto;
	private String palestrante;
	private String data;
	
	public Palestra() {}
	
	public Palestra(String assunto, String palestrante, String data) {
		this.assunto = assunto;
		this.palestrante = palestrante;
		this.data = data;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getPalestrante() {
		return palestrante;
	}

	public void setPalestrante(String palestrante) {
		this.palestrante = palestrante;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}
