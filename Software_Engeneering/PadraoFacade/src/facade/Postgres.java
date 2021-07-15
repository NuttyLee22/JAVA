package facade;

public class Postgres {
	String serviceOn;
	String serviceOff;
	
	public Postgres(String service) {
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
