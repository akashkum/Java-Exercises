package com.capgemini.truckbooking.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.capgemini.truckbooking.exception.BookingException;
import com.capgemini.truckbooking.service.PropertyServices;

public class ConnectionUtil {
	private Connection connect;

	public ConnectionUtil() throws BookingException{
		PropertyServices propServices=new PropertyServices();
		
		String url=propServices.getPropertyValue("url");
		String userName=propServices.getPropertyValue("userName");
		String password=propServices.getPropertyValue("password");
		try {
			connect=DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			throw new BookingException("Connectiion Opening Failed",e );
		}

}public Connection getConnection(){
	return connect;}
}