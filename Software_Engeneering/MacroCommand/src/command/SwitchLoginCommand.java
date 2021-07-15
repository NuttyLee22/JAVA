package command;

public class SwitchLoginCommand implements Command{
	Switch sw;
	
	public SwitchLoginCommand(Switch sw) {
		this.sw = sw;
	}

	@Override
	public void execute() {
		sw.login();
	}

	@Override
	public void undo() {
		sw.logoff();
	}
	
}
