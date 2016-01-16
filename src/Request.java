
public class Request {
	private boolean grams;
	private double value;
	private String element;
	private double molarMass;
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
	
	
}
