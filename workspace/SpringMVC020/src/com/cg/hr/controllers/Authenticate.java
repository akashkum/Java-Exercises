package com.cg.hr.controllers;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.hr.entities.User;
import com.cg.hr.exception.EmpException;
import com.cg.hr.services.AuthServices;


/*http://localhost:8088/SpringMVC020/getLoginPage.hr
*/



@Controller
public class Authenticate {
	
	
	@Resource
	private AuthServices service;
	
	
    @RequestMapping("/getLoginPage.hr")
	public ModelAndView getLoginPage(){
		ModelAndView mAndV=new ModelAndView("Login.jsp");
		mAndV.addObject("pageHead", "Login Page");
		return mAndV;
	}
   
    
    @RequestMapping(value="/authenticate.hr",method=RequestMethod.POST)
   	public ModelAndView authenticateUser(HttpServletRequest request) throws EmpException{
   		String userName=request.getParameter("userName");
   		String password=request.getParameter("password");
   		
   		System.out.println("In controller :"+userName + ""+password);
   		User user=new User(userName,password);
   		ModelAndView mAndV=new ModelAndView();
   		user=service.isAuthanticated(user);
   		
   		if(user.isAuthSucc()){
   			mAndV.addObject("pageHead", "Main Menu");
   			mAndV.addObject("user", user);
   			mAndV.setViewName("MainMenu.jsp");
   		}
   		else
   		{   mAndV.addObject("pageHead", "Login Page");
   		mAndV.addObject("user", user);
   		System.out.println("printing...");
   			mAndV.setViewName("Login.jsp");
   		}
   		return mAndV;
   	}
    
    
}
