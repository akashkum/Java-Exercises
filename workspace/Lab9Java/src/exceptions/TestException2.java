package exceptions;

import java.util.Scanner;

public class TestException2 {
	
static Scanner salInput=new Scanner(System.in);
	public static void main(String[] args)  {// The 'throws' is a clause
		int salary=0;
		try {
			salary = getSalary();  
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(salary);
	}
	public static int getSalary() throws CustomException {
		System.out.println("Enter Salary : ");
		int salary=salInput.nextInt();
		
		if (salary < 10000){
			throw new CustomException("Input below minimum salary.");//The 'throw' is a statement
		}
		return salary;
	}

}
