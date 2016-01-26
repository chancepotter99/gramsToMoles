
public class Element {
	private String symbol;
	private String name;
	private double molarMass;
	private int coefficient;

	/**
	 * Encapsulates the attributes of an element.
	 * The values passed into the constructor do (can) not change. The coefficient can change depending on the chemical
	 * formula.
	 * @param symbol the symbol on the periodic table of the elements
	 * @param name the name on the periodic table of the elements
	 * @param molarMass the molar mass of the element
	 */
	public Element(String symbol, String name, double molarMass) {
		this.symbol = symbol;
		this.name = name;
		this.molarMass = molarMass;
		this.coefficient = 1;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}
	public double getMolarMass() {
		return molarMass;
	}

	/**
	 * The coefficient used when the {@link Element} is part of a formula
	 * @return
	 */
	public int getCoefficient() {
		return coefficient;
	}

	/**
	 * Set the coefficient used when the {@link Element} is part of a formula
	 * @param coefficient
	 */
	public void setCoefficient(int coefficient) {
		if(coefficient < 1) {
			throw new IllegalArgumentException("Coefficient cannot be less than 1");
		}
		this.coefficient = coefficient;
	}
}
