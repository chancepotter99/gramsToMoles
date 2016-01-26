import java.util.ArrayList;
import java.util.List;

public class Request {
	private List<Element> elements = new ArrayList<>();
	private boolean useGrams = false;// Mole to gram or gram to mole conversion
	private double gramsOrMolarMass = 0;
	private String input;

	public boolean useGrams() {
		return useGrams;
	}

	public void setUseGrams(boolean useGrams) {
		this.useGrams = useGrams;
	}

	public double getGramsOrMolarMass() {
		return gramsOrMolarMass;
	}

	public void setGramsOrMolarMass(double gramsOrMolarMass) {
		this.gramsOrMolarMass = gramsOrMolarMass;
	}

	public Element getElement(String elementNameOrSymbol) {
		for (Element element : elements) {
			if (element.getName().equals(elementNameOrSymbol) || element.getName().equals(elementNameOrSymbol)) {
				return element;
			}
		}

		return null;
	}

	public void addElement(Element element) {
		elements.add(element);
	}

	public List<Element> getElements() {
		return elements;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}
}
