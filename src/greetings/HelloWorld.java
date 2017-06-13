package greetings;

import printing.*;

public class HelloWorld {

	public static void main(String[] args)
	{
		Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "MY PRINTER", new ColorCartridge());
        Printer<BWCartridge> printer2 = new Printer<BWCartridge>(true, "My Printer2", new BWCartridge());
		//Machine machine = new Machine(false);
		//printer.print(1);
		//printer.printUsingCartridge(new BWCartridge(),"Hi!");


        //printer.printUsingCartridge(new ColorCartridge(),"Hi!");
		//printer.TurnOn();

        //printer.print(1);
		printOne(printer);
	}


	public static void printOne(Printer<? extends ICartridge> printer) {
	    String fillPercentage = printer.getCartridge().getFillPercentage();
	    System.out.println(fillPercentage);
    }
}
