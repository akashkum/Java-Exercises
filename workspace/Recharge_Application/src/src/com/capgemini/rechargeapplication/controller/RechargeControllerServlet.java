package src.com.capgemini.rechargeapplication.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import src.com.capgemini.rechargeapplication.bean.Recharge;
import src.com.capgemini.rechargeapplication.exception.RechargeException;
import src.com.capgemini.rechargeapplication.service.RechargeImplService;


@WebServlet("*.do")
public class RechargeControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RechargeControllerServlet() {
		super();
		
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RechargeImplService Service = new RechargeImplService();;

		HttpSession session = request.getSession(true);
		
		
		String target = "Display.jsp";
		
		
			 ArrayList<Recharge> RechargeList = null;
			try {
				RechargeList = Service.getAllRecharge();
	
			} catch (RechargeException e) {
				e.printStackTrace();
				
			}
			
				session.setAttribute("R",RechargeList);
         System.out.println(RechargeList);
		RequestDispatcher dispatcher = request.getRequestDispatcher(target);
		dispatcher.forward(request, response);
	}

}
