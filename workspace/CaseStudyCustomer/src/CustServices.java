

import java.util.ArrayList;

public interface CustServices extends AutoCloseable {
	ArrayList<Customer> getCustList() throws Exception; 
	Customer getCustOnId(int Cust_Id) throws Exception;
	 boolean addNewCust(Customer cust) throws CustException;
	void close() throws CustException;
}
