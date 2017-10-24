package src.com.cg.dth.service;
import java.util.ArrayList;
import java.util.List;

import src.com.cg.dth.bean.Subscriber;
import src.com.cg.dth.exception.DTHException;


public interface SubscriberService {
	public Subscriber getAccDetails(String mnumb) throws DTHException;
	
}
