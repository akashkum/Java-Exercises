
/*This code consists of Main Class taking choices from User to input values
                              Employee Name : Vipul Gupta
                                Employee Id : 134255
*/
package com.capgemini.truckbooking.test; 
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.ArrayList;  // Importing ArrayList class
import java.util.Date;// Importing Date Class
import java.util.Scanner; // Importing Scanner Class

import com.capgemini.truckbooking.bean.BookingBean;
import com.capgemini.truckbooking.bean.TruckBean;
import com.capgemini.truckbooking.exception.BookingException;
import com.capgemini.truckbooking.service.TruckService;
import com.capgemini.truckbooking.service.TruckServicesImpl;
import com.capgemini.truckbooking.validation.ValidateBookingProcedure;

public class UserInterface {
	public static void main(String[] args) throws Exception {
		ValidateBookingProcedure validator=new ValidateBookingProcedure();  //VALIDATION OBJECT CREATED
		java.util.Date Date = new java.util.Date(); 
		try (TruckService services=new TruckServicesImpl();){
			Scanner kbdInput=new Scanner(System.in);
			
			int choice=0;
do{	
			System.out.println("1.Book Trucks");  //1 for booking trucks
			System.out.println("2.Exit");  // 2 for Exit
			
			choice=kbdInput.nextInt();
			switch(choice){
			
			case 1:                                       //Add new Booking Details
			{
			String custId;
			boolean pNoValid=true;
			do {
				System.out.println("Enter custId");   //Asking for the customer id from user
						custId=kbdInput.next();
				
				 pNoValid = validator.validateCustId(custId);
			} while (!pNoValid);

			
			ArrayList<TruckBean> TruckList=null;         //Creating the array list
			try {
				TruckList = services.getTruckList();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			for(TruckBean truck: TruckList)
			{
				System.out.println(truck);
			}
			
		    System.out.println(" ");
			int truckid;
			do {
				System.out.println("Please Enter the Truck Id"); //Asking for the truck Id
				truckid = kbdInput.nextInt();
			} while (!(truckid==1000 || truckid==1001 || truckid==2000 || truckid==2001 || truckid==1002 || truckid==1003 ||  truckid==1004 || truckid==3005) );
			String nooftrucks1;
			do {
				System.out.println("Enter the Number of Trucks you want to book.");
				nooftrucks1 = kbdInput.next();
				pNoValid=validator.validateNoOfTrucks(nooftrucks1);
			} while (!pNoValid);
			int nooftrucks=Integer.parseInt(nooftrucks1);
			
			System.out.println("Enter Customer Mobile Number");
			Long mobile=kbdInput.nextLong();
			 
			System.out.println("Enter Date Of transport");
			String date=kbdInput.next();
			BookingBean book=new BookingBean(custId,truckid,mobile,nooftrucks);
			book.setBookingID(1000);
			boolean issucc=services.bookTrucks(book);
			if(issucc){
				
				System.out.println("Thank You for Booking  ! Your Booking Id is: " + book.getBookingID()); //Printing the Booking Id
				
			}
			else
			{
				System.out.println("Booking Failed");       //Message if in case Booking fails
			}
				break;
			}
			case 2://Exit
			{System.out.println("Thanks and Visit Again");
				break;
			}
}
}while(choice != 2);
		} catch (BookingException e) {
			
			e.printStackTrace();
		} 
		}

	

	
	
}
