import java.util.ArrayList;
public interface PurchaseServices extends AutoCloseable {
	/*ArrayList<Purchase> getPurchaseList() throws Exception; 
Purchase getPurchaseOnId(int purchaseid) throws Exception;*/
	 boolean addNewPurchase(Purchase pdetails) throws PurchaseException;
	void close() throws PurchaseException;
}
