package facade;

public class IpTables {
	String serviceOn;
	String serviceOff;
	
	public IpTables(String service) {
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

