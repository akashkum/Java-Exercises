package src.com.cg.dth.dao;
import java.util.ArrayList;
import java.util.List;

import src.com.cg.dth.bean.Subscriber;
import src.com.cg.dth.exception.DTHException;

public interface subscriberDAO {
	public Subscriber getAccDetails(String mnumb) throws DTHException;
}
