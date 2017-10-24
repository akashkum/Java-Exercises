package com.cg.hr.tests;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.hr.entities.Employee;
import com.cg.hr.exceptions.EmpException;
import com.cg.hr.services.EmpServices;
import com.cg.hr.services.EmpServicesImpl;

public class TestDI {

	public static void main(String[] args) {
		
		/*EmpServices service = new EmpServicesImpl();
		System.out.println("Object Created");*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("EmpManagement.xml");
		EmpServices service = (EmpServices)ctx.getBean("empServices");
		try {
			List<Employee> empList=service.getAllEmps();
			for(Employee var:empList)
				System.out.println(var);
			
			
		} catch (EmpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
