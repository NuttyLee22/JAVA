package facade;

public class IsaServer {
	String serviceOn;
	String serviceOff;
	
	public IsaServer(String service) {
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

