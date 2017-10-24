package src.src.com.cg.ebill.service;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import src.com.cg.ebill.bean.Consumers;
import src.src.com.cg.ebill.dao.ebillDAO;
import src.src.com.cg.ebill.dao.ebillDAOimpl;
import src.src.com.cg.ebill.exception.EbillException;
public class ebillServiceimpl implements ebillService {
	ebillDAO dao = new ebillDAOimpl();

	public ArrayList<Consumers> getAllConsumers() throws EbillException {

		ArrayList<Consumers> clist = dao.getAllConsumers();
		return clist;
	}
	
	public Consumers getConsumer(int cnumb) throws EbillException {
		Consumers cbean = new Consumers(cnumb, null, null);

		cbean = dao.getConsumer(cnumb);
		return cbean;

	}
	
	
	
	
}

	
	
	
	
	
	
	
	

