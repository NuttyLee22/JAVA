package command;

public class SwitchLogoffCommand implements Command{
	Switch sw;
	
	public SwitchLogoffCommand(Switch sw) {
		this.sw = sw;
	}
	
	@Override
	public void execute() {
		sw.logoff();
	}
	
	@Override
	public void undo() {
		sw.login();
	}
}
