package command;

public class SwitchOnCommand implements Command{
	Switch sw;
	
	public SwitchOnCommand(Switch sw) {
		this.sw = sw;
	}
	
	@Override
	public void execute() {
		sw.on();
	}
	
	public void undo() {
		sw.off();
	}
	
}

