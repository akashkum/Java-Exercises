
import java.util.ArrayList;
public class CustServicesImpl implements CustServices {
private CustdbDao dao;
public CustServicesImpl() throws CustException{
	dao=new CustdbDaoimpl();
}
	@Override
	public ArrayList<Customer> getCustList() throws Exception {
		// TODO Auto-generated method stub
		return dao.getCustList();
		
	}

	@Override
	public Customer getCustOnId(int Cust_Id) throws Exception {
		// TODO Auto-generated method stub
		return dao.getCustOnId(Cust_Id);
	}

	@Override
	public boolean addNewCust(Customer cust) throws CustException {
		// TODO Auto-generated method stub
		return dao.addNewCust(cust);
	}

	@Override
	public void close() throws CustException {
		try {
			dao.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
