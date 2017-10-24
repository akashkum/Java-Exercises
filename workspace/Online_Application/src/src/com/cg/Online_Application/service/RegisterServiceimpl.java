package src.com.cg.Online_Application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import src.com.cg.Online_Application.dao.RegisterDAO;
import src.com.cg.Online_Application.dao.RegisterDAOimpl;
import src.com.cg.Online_Application.exception.RegisterException;

import com.cg.Online_Application.bean.User;


public class RegisterServiceimpl implements RegisterService {
	RegisterDAO dao = new RegisterDAOimpl();

	public int registeruser(User userbean) throws RegisterException {

		int result = dao.registeruser(userbean);
		return result;
	}

	

/*	public List<String> isValidated(DonorDTO donor) {
		List<String> errorList = new ArrayList<String>();

		Pattern pattern = null;
		Matcher matcher = null;

		// Donor Name Validation
		pattern = Pattern.compile("^[A-Za-z\\s]{3,25}$");
		matcher = pattern.matcher(donor.getDonorName());
		if (!matcher.matches()) {
			errorList.add("Please enter a valid Name");
		}

		// Phone Number Validation
		if (donor.getPhoneNumber() <= 999999999) {
			errorList.add("Please enter a valid Phone Number");
		}

		// Address Validation
		pattern = Pattern.compile("^[A-Za-z0-9\\s,./]{3,}$");
		matcher = pattern.matcher(donor.getAddress());
		if (!matcher.matches()) {
			errorList.add("Please enter a valid Address");
		}

		// Amount Validation
		if (donor.getAmount() <= 0) {
			errorList.add("Please enter a valid Amount");
		}
		return errorList;
	}
*/
}
