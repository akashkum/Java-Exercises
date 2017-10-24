import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) throws Exception {
		ValidatePurchaseDetails validator=new ValidatePurchaseDetails();
		
		try (PurchaseServices services=new PurchaseServicesImpl();){
			Scanner kbdInput=new Scanner(System.in);
			int choice=0;
do{	
			System.out.println("1.Add new Purchase Details");
			System.out.println("2.Exit");
			System.out.println("Enter a Choice");
			choice=kbdInput.nextInt();
			switch(choice){
			
			case 1://Add new Employees
			{System.out.println("1.Add new purchase details of the customer");
			String cname;
			boolean pNoValid=true;
			do {
				/*System.out.println("Enter empId");
						int empNo=kbdInput.nextInt();*/
				System.out.println("Enter CustomerName");
				cname = kbdInput.next();
				 pNoValid = validator.validateName(cname);
			} while (!pNoValid);
			System.out.println("Enter Mail Id");
			String mailid=kbdInput.next();
			System.out.println("Enter Phone No.");
			String phone=kbdInput.next();
			System.out.println("Enter Mobile Id");
			int mobileid=kbdInput.nextInt();
			Purchase pdetails=new Purchase(cname,mailid,phone,mobileid);
			boolean issucc=services.addNewPurchase(pdetails);
			if(issucc){
				System.out.println("Purchase details successfully Entered");
			}
			else
			{
				System.out.println("Purchase details input failed");
			}
				break;
			}
			case 2://Exit
			{System.out.println("Thanks and Visit Again");
				break;
			}
}
}while(choice != 2);
		} catch (PurchaseException e) {
			
			e.printStackTrace();
		} 
		}
}
