package com.capgemini.truckbooking.validation;

import java.util.regex.Matcher;  // Matcher imported
import java.util.regex.Pattern;

public class ValidateBookingProcedure {


public boolean validateCustId(String custid){    //VALIDATING THE CUSTOMERID
	Pattern pt=Pattern.compile("[A-Z][0-9]{6}");
	Matcher match=pt.matcher(custid);
	return match.matches();
	
}



public boolean validateNoOfTrucks(String nooftrucks1){   //VALIDATING NO OF TRUCKS
	Pattern pt=Pattern.compile("[1-9]");
	Matcher match=pt.matcher(nooftrucks1);
	return match.matches();
	
}

}
