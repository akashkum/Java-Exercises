

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) throws Exception {
		
		
		try (CustServices services=new CustServicesImpl();){
			Scanner kbdInput=new Scanner(System.in);
			int choice=0;
do{	
			System.out.println("Menu...");
			System.out.println("1. View List of all Customers");
			System.out.println("2.View Details of all Customers");
			System.out.println("3.Add new Customers");
			System.out.println("4.Exit");
			System.out.println("Enter a Choice");
			choice=kbdInput.nextInt();
			switch(choice){
			case 1://View List of all Employees
			{System.out.println("1. View List of all Employees");
			
			ArrayList<Customer> CustList=null;
			try {
				CustList = services.getCustList();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(Customer cust: CustList)
			{
				System.out.println(cust);
			}
			
				break;
			}
			case 2://View Details of all Employees
			{System.out.println("2.View Details of all Customers");
			System.out.println("Enter Customer Identity Number");
			int Cust_Id=kbdInput.nextInt();
			Customer cust = services.getCustOnId(Cust_Id);
			
			if ( cust==null)
				{System.out.println("Wrong Customer No.. , Customer not found");}
			else
				{System.out.println(cust);}
				break;
			}
			case 3://Add new Employees
			{System.out.println("3.Add new Customers");
			
			System.out.println("Enter Name of the Customer");
			String 	Cust_Name=kbdInput.next();
			System.out.println("Enter Gender");
		String gender=kbdInput.next();
			
			Customer cust=new Customer(Cust_Name,gender);
			boolean issucc=services.addNewCust(cust);
			if(issucc){
				System.out.println("Joining of Customer is successfull");
			}
			else
			{
				System.out.println("Joining of Customer failed");
			}
				break;
			}
			case 4://Exit
			{System.out.println("Thanks and Visit Again");
				break;
			}
}//End of Switch
}while(choice != 4);
		} catch (CustException e) {
			
			e.printStackTrace();
		} /*finally{
			if(services !=null)
			try{
				services.close();
			}
			catch (EmpException e) {
		
			
			e.printStackTrace();
		}}*/
}//End of Main
}//End of Class