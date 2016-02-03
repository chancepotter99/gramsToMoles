import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String EXAMPLE_TEST = console.next();
		System.out.println(EXAMPLE_TEST.matches("([A-Z][a-z]?)(\\d*)"));
		String[] splitString = (EXAMPLE_TEST.split("\\d"));
		System.out.println(splitString.length);// should be 14
		for (String string : splitString) {
			System.out.println(string);
		}
		// replace all whitespace with tabs
		System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
	}
}
