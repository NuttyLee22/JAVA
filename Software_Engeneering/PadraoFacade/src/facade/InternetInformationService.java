package facade;

public class InternetInformationService {
	String serviceOn;
	String serviceOff;
	
	public InternetInformationService(String service) {
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

