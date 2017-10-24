
import java.util.ArrayList;

public interface CustdbDao {
	
	ArrayList<Customer> getCustList() throws Exception; 
	Customer getCustOnId(int Cust_id) throws Exception;
	 boolean addNewCust(Customer cust) throws CustException;
	void close() throws Exception;
}
