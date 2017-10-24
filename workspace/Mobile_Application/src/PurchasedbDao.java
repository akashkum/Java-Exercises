

import java.util.ArrayList;

public interface PurchasedbDao {
	
	//ArrayList<Purchase> getPurchaseList() throws Exception; 
	//Purchase getPurchaseOnId(int purchaseid) throws Exception;
	 boolean addNewPurchase(Purchase pdetails) throws PurchaseException;
	void close() throws Exception;
	
}
