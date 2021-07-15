package adapter;

public class Estagio {
	private String local;
	private String cargo;
	
	public Estagio() {}
	
	public Estagio(String local, String cargo) {
		this.local = local;
		this.cargo = cargo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}

