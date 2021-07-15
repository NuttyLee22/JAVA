package command;

public class RoteadorBgpCommand implements Command{
	Roteador roteador;
	
	public RoteadorBgpCommand(Roteador roteador) {
		this.roteador = roteador;
	}
	
	@Override
	public void execute() {
		roteador.bgp();
	}
	
	@Override
	public void undo() {
		roteador.ospf();
	}
}
