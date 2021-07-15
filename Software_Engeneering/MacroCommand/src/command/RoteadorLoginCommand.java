package command;

public class RoteadorLoginCommand implements Command{
	Roteador roteador;
	
	public RoteadorLoginCommand(Roteador roteador) {
		this.roteador = roteador;
	}
	
	@Override
	public void execute() {
		roteador.login();
	}
	
	@Override
	public void undo() {
		roteador.logoff();
	}
}
