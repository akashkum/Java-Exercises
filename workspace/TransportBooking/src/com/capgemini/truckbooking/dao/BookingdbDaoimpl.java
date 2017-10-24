package com.capgemini.truckbooking.dao;  
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.capgemini.truckbooking.bean.BookingBean;
import com.capgemini.truckbooking.bean.TruckBean;
import com.capgemini.truckbooking.exception.BookingException;
import com.capgemini.truckbooking.util.ConnectionUtil;

public class BookingdbDaoimpl implements BookingdbDao {
private Connection connect;                                   //Connection established
static Logger myLogger=Logger.getLogger("myLogger"); //Creating object of Logger Class
public BookingdbDaoimpl() throws BookingException{
	ConnectionUtil util = new ConnectionUtil(); // new object of connectionutil class
	connect=util.getConnection();
	myLogger.info("Connection proccured in BookingdbDaoImpl."); //Message eneterd in log file
	
}

@Override
public ArrayList<TruckBean> getTruckList() throws Exception {  
	ArrayList<TruckBean> TruckList=new ArrayList<>();
	myLogger.info("Execution in getEmpList() .");
	String qry="SELECT * FROM TruckDetails";           //Query for displaying complete data
	try(Statement stmt=connect.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			
			) {
		myLogger.info("Connection execution. " +qry);
		
		while(rs.next()){                   //Loop of resultset 
				int truckid=rs.getInt("TRUCKID");
				String trucktype=rs.getString("TRUCKTYPE");
				String origin=rs.getString("ORIGIN");
				String destination=rs.getString("DESTINATION");     
				float charges=rs.getFloat("CHARGES");
				int availablenos=rs.getInt("AVAILABLENOS");
				TruckList.add(new TruckBean(truckid,trucktype,origin,destination,charges,availablenos));
				
	}
	}catch (SQLException e) {
		myLogger.info("execution from getTrucklist()");           //Logger msg
		throw new BookingException("problem in reading data",e);
	}
	return TruckList;
}

	@Override
	public boolean bookTrucks(BookingBean book) throws BookingException {
		String qry="INSERT INTO BookingDetails values (booking_id_Seq.nextval,?,?,?,?,sysdate)"; //writing the query for insertion
		int recsAffected=0;
	
		try(
		PreparedStatement stmt=connect.prepareStatement(qry);
				){
			
		stmt.setString(1,book.getCustid());
		stmt.setLong(2,book.getCustMobile());
		stmt.setInt(3,book.getTruckid());
		stmt.setInt(4,book.getNoOfTrucks());
		//stmt.setDate(5,(Date) book.getDateOfTransport);
		
		 recsAffected=stmt.executeUpdate();//1 for Successfull Insert
		
	}catch (SQLException e) {
		throw new BookingException("Problem in inserting data",e);
		}
		
//
		String qry1 ="UPDATE TruckDetails SET availableNos=availableNos-? WHERE truckid=?"; //Updating the Truck Details 
		int recsAff=0;
				try(PreparedStatement stmt1=connect.prepareStatement(qry1);) {
					stmt1.setInt(1,book.getNoOfTrucks());
					stmt1.setInt(2,book.getTruckid());
					 recsAff=stmt1.executeUpdate();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
	
		return (recsAffected==1) ? true : false ; //////
		
	
		
	}
	
	public void close() throws BookingException{
		try {
			if(connect !=null)
				connect.close();
		} catch (SQLException e) {
			throw new BookingException("problem in closing connection",e);   //Msg with error if in case exception arises
		}}


}
