
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String EXAMPLE_TEST = console.next();
		System.out.println(EXAMPLE_TEST.matches("(([A-Z][a-z]?)(\\d*))*"));
		String[] atmcoef = (EXAMPLE_TEST.split("(?=[A-Z])"));
		String[] splitString = (EXAMPLE_TEST.split("\\d"));
		String[] digits = (EXAMPLE_TEST.split("([A-Z][a-z]?)"));
		System.out.println(splitString.length);// should be 14
		for (int y = 0; y < atmcoef.length; y++) {
			if (!atmcoef[y].matches(".*\\d")) {
				atmcoef[y] = atmcoef[y] + "1";
			}
	
		}
		String[] atms = new String[atmcoef.length];
		String[] coefs = new String[atmcoef.length];
		
		for (int j = 0; j < atmcoef.length; j++) {
			atms[j] = atmcoef[j].replaceAll("\\d*", "");
			coefs[j] = atmcoef[j].replaceAll("[A-Z][a-z]?", "");
		}
		for (int j = 0; j < atmcoef.length; j++) {
			System.out.println(atms[j] + " " + coefs[j]);
		}
		
		for (String atm : atmcoef) {
			System.out.println(atm);
		}
		for (String string : splitString) {
			System.out.println(string);
		}
		for (String digit : digits) {
			System.out.println(digit);
		}
		// replace all whitespace with tabs
		System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
		console.close();
	}
}
