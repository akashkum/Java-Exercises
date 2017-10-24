package com.cg.hr.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.hr.services.EmpServices;
import com.cg.hr.services.EmpServicesImpl;

public class TestDI {

	
	public static void main(String[] args) {
		/*
		EmpServices services= new EmpServicesImpl();
		System.out.println("Object Created");*/
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("EmpManagement.xml");
		EmpServices services=(EmpServices)ctx.getBean("empServices");
		
		
		try {
			services.getAllEmps();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
