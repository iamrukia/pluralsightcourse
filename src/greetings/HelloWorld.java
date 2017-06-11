package greetings;

import printing.IMachine;
import printing.Machine;
import printing.Printer;
import printing.ColorCartridge;

public class HelloWorld {

	public static void main(String[] args)
	{
		Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "MY PRINTER", new ColorCartridge());

		//Machine machine = new Machine(false);
		printer.print(1);

		//printer.TurnOn();
				
	}
}
