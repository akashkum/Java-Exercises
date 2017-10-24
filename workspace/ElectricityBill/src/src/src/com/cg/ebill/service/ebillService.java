package src.src.com.cg.ebill.service;
import java.util.ArrayList;
import java.util.List;
import src.com.cg.ebill.bean.Consumers;
import src.src.com.cg.ebill.exception.EbillException;



public interface ebillService {
	public Consumers getConsumer(int cnumb) throws EbillException;
	public ArrayList<Consumers> getAllConsumers()throws EbillException;
}
