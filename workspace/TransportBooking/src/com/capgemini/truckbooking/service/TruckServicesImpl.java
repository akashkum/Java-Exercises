package com.capgemini.truckbooking.service;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.capgemini.truckbooking.bean.BookingBean;
import com.capgemini.truckbooking.bean.TruckBean;
import com.capgemini.truckbooking.dao.BookingdbDao;
import com.capgemini.truckbooking.dao.BookingdbDaoimpl;
import com.capgemini.truckbooking.exception.BookingException;

public class TruckServicesImpl implements TruckService {
private BookingdbDao dao;
static Logger myLogger=Logger.getLogger("myLogger");
public TruckServicesImpl() throws BookingException{
	myLogger.info("Service : Dao Injected ");
	dao=new BookingdbDaoimpl();
}
	@Override
	public ArrayList<TruckBean> getTruckList() throws Exception {
		// TODO Auto-generated method stub
		return dao.getTruckList();
		
	}

	@Override
	public boolean bookTrucks(BookingBean book) throws BookingException {
		// TODO Auto-generated method stub
		return dao.bookTrucks(book);
	}

	@Override
	public void close() throws BookingException {
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
