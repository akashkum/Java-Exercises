package com.capgemini.truckbooking.dao;



import java.util.ArrayList;

import com.capgemini.truckbooking.bean.BookingBean;
import com.capgemini.truckbooking.bean.TruckBean;
import com.capgemini.truckbooking.exception.BookingException;

public interface BookingdbDao {
	
	ArrayList<TruckBean> getTruckList() throws Exception; 
	 boolean bookTrucks(BookingBean book) throws BookingException;
	void close() throws Exception;
}

