package command;

public class SwitchOffCommand implements Command{
	Switch sw;
	
	public SwitchOffCommand(Switch sw) {
		this.sw = sw;
	}
	
	@Override
	public void execute() {
		sw.off();
	}
	
	public void undo() {
		sw.on();
	}
	
}

