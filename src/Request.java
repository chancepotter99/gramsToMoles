
public class Request {
	
	private boolean grams;// Mole to gram or gram to mole conversion
	private double value;// Value of moles or grams
	private String element;// Full name of element
	private double molarMass;// Molar mass of the element
	private int coefficient = 1;
	public void isGrams(boolean isGrams) {
		grams = isGrams;
	}
	
	public void setValue(double elementValue) {
		value = elementValue;
	}
	
	public void setElement(String elementName) {
		element = elementName;
	}
	
	public void setMolarMass(double molarMassValue) {
		molarMass = molarMassValue;
	}
	
	public boolean getMolesOrGrams() {
		return grams;
	}
	
	public double getMolesOrGramsValue() {
		return value;
	}
	
	public String getElement() {
		return element;
	}
	
	public double getMolarMass() {
		return molarMass;
	}

	public int getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(int coefficient) {
		if(coefficient < 1) {
			throw new IllegalArgumentException("Coefficient cannot be less than 1");
		}
		this.coefficient = coefficient;
	}
	
	
}
