package src.com.cg.dth.service;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import src.com.cg.dth.bean.Subscriber;
import src.com.cg.dth.dao.subscriberDAO;
import src.com.cg.dth.dao.subscriberDAOimpl;
import src.com.cg.dth.exception.DTHException;

public class SubscriberServiceimpl implements SubscriberService {
	subscriberDAO dao = new subscriberDAOimpl();
	
	public Subscriber getAccDetails(String mnumb) throws DTHException {
		Subscriber sbean = new Subscriber(0, mnumb, mnumb, 0, null);

		sbean = dao.getAccDetails(mnumb);
		return sbean;

	}
	
	
	
	
}

	
	
	
	
	
	
	
	

