package com.cg.hr.tests;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.hr.dtos.Employee;
import com.cg.hr.exception.EmpException;
import com.cg.hr.services.EmpService;

public class TestLayers {

	public static void main(String[] args){
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("EmpManagement.xml");
		
		
		try {
			EmpService service=ctx.getBean(EmpService.class);
			List<Employee> empList=service.getEmpList();
			System.out.println(empList);
			ctx.close();
		} catch (BeansException e) {
			
			e.printStackTrace();
		} catch (EmpException e) {
			
			e.printStackTrace();
		}
		
	}

}
