import java.util.*;

public class MoleConversion {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); // initialize Scanner
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
		String input = console.next();
		element(input, console);

	}

	public static void element(String input, Scanner console) {
		double molarMass;
		if (input.equalsIgnoreCase("H") || input.equalsIgnoreCase("Hydrogen")) {
			molarMass = 1.008;
			output(input, console, molarMass);
		} else if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("Nitrogen")) {
			molarMass = 14.01;
			output(input, console, molarMass);
		} else if (input.equalsIgnoreCase("O") || input.equalsIgnoreCase("Oxygen")) {
			molarMass = 16.00;
			output(input, console, molarMass);
		} else if (input.equalsIgnoreCase("C") || input.equalsIgnoreCase("Carbon")) {
			molarMass = 12.01;
			output(input, console, molarMass);
		} else {
			System.out.println("I don't know the element: " + input);
		}
		
	}

	public static void output(String input, Scanner console, double molarMass) {
		System.out.println("Grams: ");
		double grams = console.nextDouble();
		double mole = grams / molarMass; // change molar mass to a variable
		System.out.format(grams + " g of " + input + " is %.4f moles.%n", mole);
	}
}
