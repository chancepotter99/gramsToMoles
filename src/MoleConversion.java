import java.util.*;
import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;

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
		elements.add(new Element("H", "Hydrogen", 1.00794));
		elements.add(new Element("He", "Helium", 4.002602));
		elements.add(new Element("Li", "Lithium", 6.941));
		elements.add(new Element("Be", "Beryllium", 9.012182));
		elements.add(new Element("B", "Boron", 10.811));
		elements.add(new Element("C", "Carbon", 12.0107));
		elements.add(new Element("N", "Nitrogen", 14.0067));
		elements.add(new Element("O", "Oxygen", 15.9994));
		elements.add(new Element("Fl", "Flourine", 18.9984032));
		elements.add(new Element("Ne", "Neon", 20.1797));
		elements.add(new Element("Na", "Sodium", 22.98976928));
		elements.add(new Element("Mg", "Magnesium", 24.305));
		elements.add(new Element("Al", "Aluminum", 26.9815386));
		elements.add(new Element("Si", "Silicon", 28.0855));
		elements.add(new Element("P", "Phosphorus", 30.973762));
		elements.add(new Element("S", "Sulfur", 32.065));
		elements.add(new Element("Cl", "Chlorine", 35.453));
		elements.add(new Element("Ar", "Argon", 39.948));
		elements.add(new Element("K", "Potassium", 39.0983));
		elements.add(new Element("Ca", "Calcium", 40.078));
		elements.add(new Element("Sc", "Scandium", 44.955912));
		elements.add(new Element("Ti", "Titanium", 47.867));
		elements.add(new Element("V", "Vanadium", 50.9415));
		elements.add(new Element("Cr", "Chromium", 51.9961));
		elements.add(new Element("Mn", "Manganese", 54.938045));
		elements.add(new Element("Fe", "Iron", 55.845));
		elements.add(new Element("Co", "Cobalt", 58.933195));
		elements.add(new Element("Ni", "Nickel", 58.6934));
		elements.add(new Element("Cu", "Copper", 63.546));
		elements.add(new Element("Zn", "Zinc", 65.38));
		elements.add(new Element("Ga", "Gallium", 69.723));
		elements.add(new Element("Ge", "Germanium", 72.64));
		elements.add(new Element("As", "Arsenic", 74.0216));
		elements.add(new Element("Se", "Selenium", 78.96));
		elements.add(new Element("Br", "Bromine", 79.904));
		elements.add(new Element("Kr", "Krypton", 83.798));
		elements.add(new Element("Rb", "Rubidium", 85.4678));
		elements.add(new Element("Sr", "Strontium", 87.62));
		elements.add(new Element("Y", "Yttrium", 88.90585));
		elements.add(new Element("Zr", "Zirconium", 91.224));
		elements.add(new Element("Nb", "Niobium", 92.90638));
		elements.add(new Element("Mo", "Molybdenum", 95.96));
		elements.add(new Element("Tc", "Technetium", 97.9072));
		elements.add(new Element("Ru", "Ruthenium", 101.07));
		elements.add(new Element("Rh", "Rhodium", 102.9055));
		elements.add(new Element("Pd", "Palladium", 106.42));
		elements.add(new Element("Ag", "Silver", 107.8682));
		elements.add(new Element("Cd", "Cadmium", 112.411));
		elements.add(new Element("In", "Indium", 114.818));
		elements.add(new Element("Sn", "Tin", 118.71));
		elements.add(new Element("Sb", "Antimony", 121.76));
		elements.add(new Element("Te", "Tellerium", 127.6));
		elements.add(new Element("I", "Iodine", 126.90447));
		elements.add(new Element("Xe", "Xenon", 131.293));
		elements.add(new Element("Cs", "Caesium", 132.9054519));
		elements.add(new Element("Cs", "Cesium", 132.9054519));
		elements.add(new Element("Ba", "Barium", 137.327));
		elements.add(new Element("Hf", "Hafnium", 178.49));
		elements.add(new Element("Ta", "Tantalum", 180.94788));
		elements.add(new Element("W", "Tungsten", 183.84));
		elements.add(new Element("Re", "Rhenium", 186.207));
		elements.add(new Element("Os", "Osmium", 190.23));
		elements.add(new Element("Ir", "Iridium", 192.217));
		elements.add(new Element("Au", "Gold", 196.966569));
		elements.add(new Element("Hg", "Mercury", 200.59));
		elements.add(new Element("Tl", "Thallium", 204.3833));
		elements.add(new Element("Pb", "Lead", 207.2));
		elements.add(new Element("Bi", "Bismuth", 208.98040));
		elements.add(new Element("Po", "Polonium", 208.9824));
		elements.add(new Element("At", "Astatine", 209.9871));
		elements.add(new Element("Rn", "Radon", 222.0176));
		elements.add(new Element("Fr", "Francium", 223.020));
		elements.add(new Element("Ra", "Radium", 226.025));
		elements.add(new Element("Rf", "Rutherfordium", 261));
		elements.add(new Element("Db", "Dubnium", 262));
		elements.add(new Element("Sg", "Seaborgium", 266));
		elements.add(new Element("Bh", "Bohrium", 264));
		elements.add(new Element("Hs", "Hassium", 269));
		elements.add(new Element("Mt", "Meitnerium", 268));
		elements.add(new Element("Ds", "Darmstadtium", 269));
		elements.add(new Element("Rg", "Roentgenium", 272));
		elements.add(new Element("Cn", "Copernicium", 277));
		elements.add(new Element("Fl", "Flevorium", 289));
		elements.add(new Element("Lv", "Livermorium", 298));

		
		
		for (Element element : elements) {
			if (element.getSymbol().equalsIgnoreCase(input) || element.getName().equalsIgnoreCase(input)) {
				molarMass = element.getMolarMass();
				String name = element.getName();
				output(console, molarMass, name);
				found = true;
			}
		}
		if (!found) {
			System.out.println("I don't know the element: " + input);
		}

	}

	public static void output(Scanner console, double molarMass, String name) {
		System.out.println("Grams: ");
		double grams = console.nextDouble();
		double mole = grams / molarMass; // change molar mass to a variable
		System.out.format(grams + " g of " + name + " is %.4f moles.%n", mole);
	}

}
