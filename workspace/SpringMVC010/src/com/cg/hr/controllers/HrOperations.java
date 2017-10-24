package com.cg.hr.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


/*http://localhost:8088/SpringMVC010/hello.obj
*/



public class HrOperations extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("In Controller");
		ModelAndView mAndV=new ModelAndView();
		mAndV.addObject("pageHead","Welcome Mr./Ms");
		mAndV.addObject("pageHead2","Vipul");
		
		mAndV.setViewName("/Welcome.jsp");
		
		return mAndV;
	}

}
