package com.capgemini.truckbooking.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import com.capgemini.truckbooking.exception.BookingException;

public class PropertyServices {

			private Properties props;
			public PropertyServices() throws BookingException {
				props=new Properties();
				
				try (
					FileInputStream fis=new FileInputStream("ProjectDb.Properties");)
					{
					props.load(fis);
				} catch (IOException e) {
					
					throw new BookingException("Property File Missing",e);
				}
				
			}
			public String getPropertyValue(String propKey){
				return props.getProperty(propKey);
			}
}