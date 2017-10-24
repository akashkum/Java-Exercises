package com.cg.Online_Application.controller;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import src.com.cg.Online_Application.exception.RegisterException;
import src.com.cg.Online_Application.service.RegisterServiceimpl;
import src.com.cg.Online_Application.utility.DbConnection;

import com.cg.Online_Application.bean.User;
@WebServlet("*.do")
public class RegisterControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterControllerServlet() {
		super();
		
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");   
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		String path = request.getServletPath().trim();

		switch(path)
		{
		case "/activate.do" : 
			
			User beanobject=(User) session.getAttribute("userbean");
			System.out.println((int)session.getAttribute("otp"));
			System.out.println(beanobject.getEmailid());
			System.out.println(request.getParameter("mailid").trim());
			System.out.println(Integer.parseInt(request.getParameter("otp").trim()));
			
			
			if(  beanobject.getEmailid().equals(request.getParameter("mailid").trim())   && (int)session.getAttribute("otp")==Integer.parseInt(request.getParameter("otp").trim()))
			{   System.out.println("true");
				PreparedStatement preparedStatement = null;
			Connection conn = null;
			ResultSet resultSet = null;
				try {
					conn = DbConnection.getConnection();
					String qry1 ="UPDATE firms_master SET isactive='Y' where email=? ";
					int recsAff=0;
							PreparedStatement stmt1=conn.prepareStatement(qry1);
							stmt1.setString(1,beanobject.getEmailid());
								 recsAff=stmt1.executeUpdate();
				} catch (RegisterException e) {
					
					e.printStackTrace();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("activated.jsp");   
				dispatcher.forward(request, response);
				
					
			}
		
		case "/register.do" :
		
		   {
			   RegisterServiceimpl Service = null;
		   
		User userbean = null;
		String target = "";
		/*HttpSession session = request.getSession(true);*/
		userbean = new User(target, target, target, target,target);
		Service = new RegisterServiceimpl();
		String owner_name = request.getParameter("firstname").trim()+request.getParameter("middlename").trim()+request.getParameter("lastname").trim();
		String business_name= request.getParameter("businessname").trim();
		String email  = request.getParameter("emailid").trim();
		String mob  = request.getParameter("mobileno").trim();
		userbean.setOwner_name(owner_name);
		userbean.setBusinessname(business_name);
		userbean.setEmailid(email);
		userbean.setMobileno(mob);
		userbean.setIsactive("N");
		
		
		try {
			Service.registeruser(userbean);
		} catch (RegisterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	int rn=0;
	rn=10000+(int)(Math.random()*10000);
	
	session.setAttribute("userbean", userbean);
	session.setAttribute("otp", rn);

	RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");   
	dispatcher.forward(request, response);
	
	
		   }
	}

}
	
}
