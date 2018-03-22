
public class Request {
	
	private boolean grams;// Mole to gram or gram to mole conversion
	private double value;// Value of moles or grams
	private String element;// Full name of element
	private double[] molarMass;// Molar mass of the element
	private int mIndex = 0;
	private int[] coefficient;
	private double conversionFactor;
	
	public void isGrams(boolean isGrams) {
		grams = isGrams;
	}
	
	public void setValue(double elementValue) {
		value = elementValue;
	}
	
	public void setElement(String elementName) {
		element = elementName;
	}
	
	public void initializeMolarMass(String[] size) {
		molarMass = new double[size.length];
		mIndex = 0;
	}
	
	public void setMolarMass(double molarMassValue) {
		molarMass[mIndex++] = molarMassValue;
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
	
	public double getConversionFactor() {
		conversionFactor = 0;
		for (int x = 0; x < molarMass.length; x++) {
			System.out.println(molarMass[x] + " " + coefficient[x]);
			conversionFactor += molarMass[x] * coefficient[x];
		}
		return conversionFactor;
	}

	public void setCoefficient(int[] coefficients) {
		for (int coef : coefficients) {
			if(coef < 1) {
				throw new IllegalArgumentException("Coefficient cannot be less than 1");
			}
		}
		this.coefficient = coefficients;
	}
	
	
}
