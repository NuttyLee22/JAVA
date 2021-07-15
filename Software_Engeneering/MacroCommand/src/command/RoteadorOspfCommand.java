package command;

public class RoteadorOspfCommand implements Command{
	Roteador roteador;
	
	public RoteadorOspfCommand(Roteador roteador) {
		this.roteador = roteador;
	}
	
	@Override
	public void execute() {
		roteador.ospf();
	}
	
	@Override
	public void undo() {
		roteador.bgp();
	}
}
