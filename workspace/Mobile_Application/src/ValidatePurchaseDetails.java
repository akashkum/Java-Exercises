

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePurchaseDetails {
/*public boolean validateEmpNo(String strEmpNo){
	
	Pattern pt=Pattern.compile("[1-9][0-9]{3}");
	Matcher match=pt.matcher(strEmpNo);
	if(match.matches())
	{
		int empNo=Integer.parseInt(strEmpNo);
		if((empNo >= 5500) && (empNo <=9999))
			return true;
			else
				return false;
	}
	else
	{
		return false;
	}
	
}
*/
public boolean validateName(String cname){
	Pattern pt=Pattern.compile("[A-Z][a-z]{3,15}");
	Matcher match=pt.matcher(cname);
	return match.matches();
 	
}


}
