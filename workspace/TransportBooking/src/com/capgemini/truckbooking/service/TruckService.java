package com.capgemini.truckbooking.service;
import java.util.ArrayList;
import com.capgemini.truckbooking.bean.BookingBean;
import com.capgemini.truckbooking.bean.TruckBean;
import com.capgemini.truckbooking.exception.BookingException;
public interface TruckService extends AutoCloseable {
	ArrayList<TruckBean> getTruckList() throws Exception; 
	 boolean bookTrucks(BookingBean book) throws BookingException;
	void close() throws BookingException;
}
