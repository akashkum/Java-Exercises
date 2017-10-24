package src.com.cg.Online_Application.exception;

/**
 * Author 		: CAPGEMINI 
 * Class Name 	: DonorTransactionException 
 * Package 		: com.capgemini.donorapplication.exception
 * Date 		: Nov 21, 2016
 */

@SuppressWarnings("serial")
public class RegisterException extends Exception{
	public RegisterException(String message)
	{
		super(message);
	}
}
