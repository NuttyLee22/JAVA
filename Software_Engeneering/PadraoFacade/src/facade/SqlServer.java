package facade;

public class SqlServer {
	String serviceOn;
	String serviceOff;
	
	public SqlServer(String service) {
		serviceOn = "Ligando " + service;
		serviceOff = "Desligando " + service;
	}
	
	public void serviceOn() {
		System.out.println(serviceOn);
	}
	
	public void serviceOff() {
		System.out.println(serviceOff);
	}
}
