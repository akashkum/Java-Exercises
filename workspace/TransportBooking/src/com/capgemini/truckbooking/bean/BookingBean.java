package com.capgemini.truckbooking.bean;

import java.time.LocalDate;
import java.util.Date;

public class BookingBean {              //Bean class declared
	private int bookingID;
	private String custid;
	private long custMobile;
	private int truckid;
	private int noOfTrucks;
	LocalDate dateOfTransport;
	public Object getDateOfTransport;
	
	
	
	
	public int getBookingID() {        // setters and getters
		return bookingID;
	}
	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public long getCustMobile() {
		return custMobile;
	}
	public void setCustMobile(long custMobile) {
		this.custMobile = custMobile;
	}
	public int getTruckid() {
		return truckid;
	}
	public void setTruckid(int truckid) {
		this.truckid = truckid;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public LocalDate getDateOfTransport() {
		return dateOfTransport;
	}
	public void setDateOfTransport(LocalDate dateOfTransport) {
		this.dateOfTransport = dateOfTransport;
	}
	
	                                             //Constructors using field
	public BookingBean(String custid, 
			int truckid,long custMobile, int nooftrucks) {
		super();
		
		this.custid = custid;
		this.custMobile = custMobile;
		this.truckid = truckid;
		this.noOfTrucks = nooftrucks;
		
	}
	
}
