package command;

public class CommandTest {
	
	public static void main(String[] args) {
		Roteador roteador = new Roteador();
		Switch sw = new Switch();
		
		Control control = new Control();
		
		RoteadorLoginCommand rlc = new RoteadorLoginCommand(roteador);
		RoteadorBgpCommand rbc = new RoteadorBgpCommand(roteador);
		RoteadorOspfCommand roc = new RoteadorOspfCommand(roteador);
		RoteadorLogoutCommand rloc = new RoteadorLogoutCommand(roteador);
		
		
		SwitchOnCommand soc = new SwitchOnCommand(sw);
		SwitchLoginCommand slc = new SwitchLoginCommand(sw);
		SwitchOffCommand sofc = new SwitchOffCommand(sw);
		SwitchLogoffCommand slo = new SwitchLogoffCommand(sw);
		
		
		
		Command[] equiRotOn = { rlc, rbc };
		Command[] equiRotOff = { roc, rloc };
		
		Command[] equiSwOn = { soc, slc };
		Command[] equiSwOff = { sofc, slo };
		
		MacroCommand equiRotOnMacro = new MacroCommand(equiRotOn);
		MacroCommand equiRotOffMacro = new MacroCommand(equiRotOff);

		MacroCommand equiSwOnMacro = new MacroCommand(equiSwOn);
		MacroCommand equiSwOffMacro = new MacroCommand(equiSwOff);

		
		control.setCommand(0, equiRotOnMacro, equiRotOffMacro);
		control.setCommand(1, equiSwOnMacro, equiSwOffMacro);
		
		System.out.println(control);
		System.out.println("---Macro On---");
		control.onButtonWasPushed(0);
		System.out.println("--- Macro Off---");
		control.offButtonWasPushed(0);
				
		System.out.println(control);
		System.out.println("---Macro On---");
		control.onButtonWasPushed(1);
		System.out.println("--- Macro Off---");
		control.offButtonWasPushed(1);
	}
	
}
