package com.cg.tms.tests;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.tms.exception.TraineeException;
import com.cg.tms.services.TraineeService;




public class TestLayers {

	public static void main(String[] args){
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("TraineeManagement.xml");
		
		try {
			TraineeService service=ctx.getBean(TraineeService.class);
			
			ctx.close();
		} catch (BeansException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
