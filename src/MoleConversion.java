import java.util.*;

public class MoleConversion {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in); // initialize Scanner
		int i = 1;
		do {
			converter(console);
			System.out.println("Would you like to quit? (y/n)");
			if (console.next().equalsIgnoreCase("y")) {
				i--;
			} else {
				i = 1;
			}
		} while (i == 1);
		System.out.println("Thank you! Have a nice day!");

	}
	
	public static void converter(Scanner console) {
		System.out.println("What element is being converted?");
		String element = console.next();
		if (element.equalsIgnoreCase("C") || element.equalsIgnoreCase("Carbon")) {
			carbon(console);
			
		}
	}
	
	public static void carbon(Scanner console) {
		System.out.println("Grams: ");
		double grams = console.nextDouble();
		double mole = grams / 12.01;
		System.out.println(grams + " g of Carbon is " + mole + " moles.");
	}

}
