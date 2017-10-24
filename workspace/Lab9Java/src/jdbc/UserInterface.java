package jdbc;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * 1.Connection Pool
 * 2.Loggers
 * 3.Validation
 */
public class UserInterface {
	public static void main(String[] args) throws Exception {
		ValidateEmpData validator=new ValidateEmpData();
		
		try (EmpServices services=new EmpServicesImpl();){
			Scanner kbdInput=new Scanner(System.in);
			int choice=0;
do{	
			System.out.println("Menu...");
			System.out.println("1. View List of all Employees");
			System.out.println("2.View Details of all Employees");
			System.out.println("3.Add new Employees");
			System.out.println("4.Exit");
			System.out.println("Enter a Choice");
			choice=kbdInput.nextInt();
			switch(choice){
			case 1://View List of all Employees
			{System.out.println("1. View List of all Employees");
			
			ArrayList<Employee> empList=null;
			try {
				empList = services.getEmpList();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(Employee emp: empList)
			{
				System.out.println(emp);
			}
			
				break;
			}
			case 2://View DEtails of all Employees
			{System.out.println("2.View Details of all Employees");
			boolean empNoValid=true;
			String strEmpNo=null;
			do {
				System.out.println("Enter emp Identity Number");
				strEmpNo = kbdInput.next();
			empNoValid = validator.validateEmpNo(strEmpNo);
			} while (!empNoValid);
			int empNo=Integer.parseInt(strEmpNo);
			Employee emp = services.getEmpOnId(empNo);
			
			if ( emp==null)
				{System.out.println("Wrong empno. , employee not found");}
			else
				{System.out.println(emp);}
				break;
			}
			case 3://Add new Employees
			{System.out.println("3.Add new Employees");
			String empNm;
			boolean empNoValid=true;
			do {
				/*System.out.println("Enter empId");
						int empNo=kbdInput.nextInt();*/
				System.out.println("Enter Name");
				empNm = kbdInput.next();
				 empNoValid = validator.validateName(empNm);
			} while (!empNoValid);
			System.out.println("Enter Salary");
			float salary=kbdInput.nextFloat();
			//Employee emp=new Employee(empNo,empNm,salary);
			Employee emp=new Employee(empNm,salary);
			boolean issucc=services.addNewEmp(emp);
			if(issucc){
				System.out.println("Joining of Employee is successfull");
			}
			else
			{
				System.out.println("Joining of employee failed");
			}
				break;
			}
			case 4://Exit
			{System.out.println("Thanks and Visit Again");
				break;
			}
}//End of Switch
}while(choice != 4);
		} catch (EmpException e) {
			
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