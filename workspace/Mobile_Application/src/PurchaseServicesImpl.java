

import java.util.ArrayList;

import org.apache.log4j.Logger;

public class PurchaseServicesImpl implements PurchaseServices {
private PurchasedbDao dao;
static Logger myLogger=Logger.getLogger("myLogger");
public PurchaseServicesImpl() throws PurchaseException{
	myLogger.info("Service : Dao Injected ");
	dao=new PurchasedbDaoimpl();
}
	/*@Override
	public ArrayList<Purchase> getPurchaseList() throws Exception {
		// TODO Auto-generated method stub
		return dao.getPurchaseList();
		
	}

	@Override
	public Purchase getPurchaseOnId(int purchaseid) throws Exception {
		// TODO Auto-generated method stub
		return dao.getPurchaseOnId(purchaseid);
	}*/

	@Override
	public boolean addNewPurchase(Purchase pdetails) throws PurchaseException {
		// TODO Auto-generated method stub
		return dao.addNewPurchase(pdetails);
	}

	@Override
	public void close() throws PurchaseException {
		System.out.println("Closing Resources");
		myLogger.info("Service : Dao Closed");
		
			try {
				dao.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
