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
		testElementInput(input, console);

	}

	public static void testElementInput(String input, Scanner console) {
		double molarMass;
		boolean found = false;
		List<Element> elements = new ArrayList<Element>();
		elements.add(new Element("H", "Hydrogen", 1.008));
		elements.add(new Element("N", "Nitrogen", 14.01));
		elements.add(new Element("O", "Oxygen", 16.00));
		elements.add(new Element("C", "Carbon", 12.01));
		for (Element element : elements) {
			if (element.getSymbol().equalsIgnoreCase(input) || element.getName().equalsIgnoreCase(input)) {
				molarMass = element.getMolarMass();
				output(input, console, molarMass);
				found = true;
			}
		}
		if (!found){
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
