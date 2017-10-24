package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpr {

	public static void main(String[] args) {
		/*String val="1"; // for single digits
		Pattern pt=Pattern.compile("[0-9]");
		Matcher match=pt.matcher(val);
		System.out.println(match.matches());
		*/
		
		
		///*String val="1"; // for multiple digits
		/*String val="69";
		Pattern pt=Pattern.compile("[1-6][0-9]");
		Matcher match=pt.matcher(val);
		System.out.println(match.matches());*/
		
		//Validate MObile Number
		/*String val="7234567890";
		Pattern pt=Pattern.compile("[7-9][0-9]{9}");
		Matcher match=pt.matcher(val);
		System.out.println(match.matches());*/
		
		
		//Validate Landline
		/*String val="141-234560";
		Pattern pt=Pattern.compile("[0-9]{3}-[0-9]{6}");
		Matcher match=pt.matcher(val);
		System.out.println(match.matches());*/
		
		//Validate Name
		/*String val="Vipul gu pta";
		Pattern pt=Pattern.compile("[A-Z][a-z ]{3,15}");
		Matcher match=pt.matcher(val);
		System.out.println(match.matches());*/
		
		//Validating Email
		String val="vipulguptareso@gmail.gov";
		Pattern pt=Pattern.compile("[A-Za-z ]*@[A-Za-z]*[.](com|gov|in)");
		Matcher match=pt.matcher(val);
		System.out.println(match.matches());
		
		
		
	}

}
