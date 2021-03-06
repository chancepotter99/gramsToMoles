import java.lang.Integer;
import java.util.Scanner;


public class MoleConversion {
	/*
	 * 1. Ask Moles to grams or grams to moles 
	 * 2. If moles, ask for number of moles 
	 * 3. If grams, ask for number of grams 
	 * 4. Ask for element name/symbol
	 * 5. Look up conversion for element 
	 * 6. Perform conversion
	 * 7. Return result
	 * 8. Quit or Repeat
	 *
	 * request.isGrams(false) 
	 * request.setValue(1.675) 
	 * request.setElement("Au") (or request.setElement("Gold"))
	 * 
	 * request = getMolesOrGrams() 
	 * request = getMolesOrGramValue(request)
	 * request = getEelement(request)
	 * 
	 * Pass by value vs. Pass by reference
	 **/
	

	public static void main(String[] args) {

		
		Array elements = new Array();
		elements.add(new Element("H", "Hydrogen", 1.00794));//symbols, and molar masses
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
		elements.add(new Element("La", "Lanthanum", 138.90547));
		elements.add(new Element("Ce", "Cerium", 140.116));
		elements.add(new Element("Pr", "Praseodymium", 140.90765));
		elements.add(new Element("Nd", "Neodymium", 144.242));
		elements.add(new Element("Pm", "Promethium", 144.913));
		elements.add(new Element("Sm", "Samarium", 150.36));
		elements.add(new Element("Eu", "Europium", 151.964));
		elements.add(new Element("Gd", "Gadolinium", 157.25));
		elements.add(new Element("Tb", "Terbium", 158.92535));
		elements.add(new Element("Dy", "Dysprosium", 162.5));
		elements.add(new Element("Ho", "Holmium", 164.93032));
		elements.add(new Element("Er", "Erbium", 167.259));
		elements.add(new Element("Tm", "Thulium", 168.93421));
		elements.add(new Element("Yb", "Ytterbium", 173.054));
		elements.add(new Element("Lu", "Lutetium", 174.9668));
		elements.add(new Element("Ac", "Actinium", 227));
		elements.add(new Element("Th", "Thorium", 232.03806));
		elements.add(new Element("Pa", "Protactinium", 231.03588));
		elements.add(new Element("U", "Uranium", 238.02891));
		elements.add(new Element("Np", "Neptunium", 237));
		elements.add(new Element("Pu", "Plutonium", 244));
		elements.add(new Element("Am", "Americium", 243));
		elements.add(new Element("Cm", "Curium", 247));
		elements.add(new Element("Bk", "Berkelium", 247));
		elements.add(new Element("Cf", "Californium", 251));
		elements.add(new Element("Es", "Einsteinium", 252));
		elements.add(new Element("Fm", "Fermium", 257));
		elements.add(new Element("Md", "Mendelevium", 258));
		elements.add(new Element("No", "Nobelium", 259));
		elements.add(new Element("Lr", "Lawrencium", 262));
	
		Scanner console = new Scanner(System.in); // initialize Scanner
		Request request = new Request();
		int i = 1;
		do {
			request.isGrams(converter(console)); // sets boolean isGrams to true or false
			gramsOrMolesValue(console, request); // asks user for amount of moles or grams
			System.out.println("Chemical Formula: "); // prompts user for element name or symbol
			String input = console.next();
			request.setElement(input);
			if (input.matches("([A-Z][a-z]?\\d*)*") || input.matches("[A-z]*")) {
				String[] atmcoef = input.split("(?=[A-Z])");	
				request.initializeMolarMass(atmcoef);
				int j = atmcoef.length;
				for (int y = 0; y < j; y++) {
					if (!atmcoef[y].matches(".*\\d")) {
						atmcoef[y] = atmcoef[y] + "1";
					}
		
				}			    
		
				String[] atms = new String[j];
				String[] coefsclone = new String[j];
				int[] coefs = new int[j];
			
				for (int k = 0; k < j; k++) {
					atms[k] = atmcoef[k].replaceAll("\\d*", "");
					coefsclone[k] = atmcoef[k].replaceAll("[A-z]*", "");
					coefs[k] = Integer.parseInt(coefsclone[k]);
					System.out.println(coefs[k]);
				}
			

				
				for (int y = 0; y < j; y++) {
					
					System.out.println(atms[y] + coefs[y]);
					
				}

				request.setCoefficient(coefs);
				boolean singleAtom = false;
				if (atms.length == 1 & coefs[0] == 1) {
					singleAtom = true;
				}
		    
				output(request,  testElementInput(atms, singleAtom, console, request, elements));
			} else {
				error();
			}
			System.out.println("Would you like to quit? (y/n)");
			if (console.next().equalsIgnoreCase("y")) {
				i--;
			} else {
				i = 1;
			}
		} while (i == 1);
		System.out.println("Thank you! Have a nice day!");

	}

	/**
	 * 
	 * @param console
	 * @return True or false based on conversion type
	 */
	public static boolean converter(Scanner console) {
		//Ask for Moles to Grams or Grams to Moles conversion.
		System.out.println("Convert: 1. Moles to Grams");
		System.out.println("\t 2. Grams to Moles");
		String oneOrTwo = console.next();
		if (oneOrTwo.equals("1")) {
			return true;
		} else if (oneOrTwo.equals("2")) {
			return false;
		} else {
			System.out.println("Error: Please choose 1 or 2.");
			return converter(console);
		}
	}
	
	/**
	 * 
	 * @param input
	 * @param console
	 * @param request
	 */
	public static boolean testElementInput(String[] atminput, boolean oneAtom, Scanner console, Request request, Array elements) {
		
		double molarMass;
		boolean found = false;
		
		for(String input : atminput) {
			for (Element element : elements.element) {
				if (element.getSymbol().equalsIgnoreCase(input) || element.getName().equalsIgnoreCase(input)) {
					molarMass = element.getMolarMass();
					if (oneAtom) {
						request.setElement(element.getName());
					}
					request.setMolarMass(molarMass);
					found = true;
				}
			}	
		}
		if (!found) {
			error();
		}
		return found;
	}

	/**
	 * 
	 * @param console
	 * @param request
	 */
	public static void gramsOrMolesValue(Scanner console, Request request) {
		// Asks for value of measurement being converted
		if (request.getMolesOrGrams()) {
			System.out.println("Moles: ");
			double moles = console.nextDouble();
			request.setValue(moles);
		} else {
			System.out.println("Grams: ");
			double grams = console.nextDouble();
			request.setValue(grams);
		}
	}
	
	/**
	 * Prints the opposite measurement after conversion.
	 * @param request 
	 */
	public static void output(Request request, Boolean found) {
		if (found) {
			if (request.getMolesOrGrams()) {
				double moles = request.getMolesOrGramsValue();
				double grams = moles * request.getConversionFactor();
				System.out.format(moles + " moles of " + request.getElement() + " is %.2f g.%n", grams);
			} else {
				double grams = request.getMolesOrGramsValue();
				double mole = grams / request.getConversionFactor(); 
				System.out.format(grams + " g of " + request.getElement() + " is %.4f moles.%n", mole);
			}
		}
	}
	
	public static void error() {
		System.out.println("Please input a valid element or chemical formula!");
	}

}
