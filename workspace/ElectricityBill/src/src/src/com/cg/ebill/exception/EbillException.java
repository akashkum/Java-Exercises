package src.src.com.cg.ebill.exception;

/**
 * Author 		: CAPGEMINI 
 * Class Name 	: DonorTransactionException 
 * Package 		: com.capgemini.donorapplication.exception
 * Date 		: Nov 21, 2016
 */

@SuppressWarnings("serial")
public class EbillException extends Exception{
	public EbillException(String message)
	{
		super(message);
	}
}
