package jdbc;

import java.util.ArrayList;

public class TestJDBC020 {

	public static void main(String[] args) {
		EmpdbDao dao=null;
		ArrayList<Employee> empList=null;
		try {
			dao=new EmpdbDaoimpl();
			Employee emp=dao.getEmpOnId(7499);
			System.out.println(emp);
			
			/*for(Employee emp : empList){
				System.out.println(emp);
			}*/
			
			
			Employee emp1=new Employee(8102,"aaaa",8000);
		System.out.println(dao.addNewEmp(emp1));	
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				dao.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}

}
