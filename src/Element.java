
public class Element {
	private String symbol;
	private String name;
	private double molarMass;
	public Element(String symbol, String name, double molarMass) {
		this.setSymbol(symbol);
		this.setName(name);
		this.setMolarMass(molarMass);
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMolarMass() {
		return molarMass;
	}
	public void setMolarMass(double molarMass) {
		this.molarMass = molarMass;
	}

}
