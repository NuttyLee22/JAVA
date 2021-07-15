package command;

public class RoteadorLogoutCommand implements Command{
	Roteador roteador;
	
	public RoteadorLogoutCommand(Roteador roteador) {
		this.roteador = roteador;
	}
	
	@Override
	public void execute() {
		roteador.logoff();
	}
	
	@Override
	public void undo() {
		roteador.login();
	}
}
