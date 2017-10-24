package src.com.cg.ebill.controller;
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
import src.com.cg.ebill.bean.Consumers;
import src.src.com.cg.ebill.exception.EbillException;
import src.src.com.cg.ebill.service.ebillServiceimpl;



@WebServlet("*.do")
public class EbillController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EbillController() {
		super();
		
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		ebillServiceimpl service = null;
		Consumers cbean = null;
		String target = "";

		HttpSession session = request.getSession(true);
		
		cbean = new Consumers(0, target, target);
		service = new ebillServiceimpl();
		int donorId = 0;
		String targetAdd = "view/addDonor.jsp";
		String targetSuccess = "view/success.jsp";
		String targetView = "Show_Consumer.jsp";
		String targetViewAll = "Show_ConsumerList.jsp";
		String targetError = "view/error.jsp";
		String targetHome = "view/index.jsp";
		String path = request.getServletPath().trim();

		switch(path)
		{
				
		case "/clist.do":
			ArrayList<Consumers> clist = null;
			try {
				clist = service.getAllConsumers();
			} catch (EbillException e) {
				session.setAttribute("error", e.getMessage());
				/*target = targetError;*/
			}
			if (!clist.isEmpty()) {
				session.setAttribute("error", null);
				session.setAttribute("clist", clist);
				target = targetViewAll;
			} else {
				session.setAttribute("clist", null);
				session.setAttribute("error", "Sorry No data Found!");
				target = targetViewAll;
			}
		case "/search.do":
			int cnumb=0;
			cnumb = Integer.parseInt(request.getParameter("cnumb"));
			try {
				cbean = service.getConsumer(cnumb);
			} catch (EbillException e) {
				session.setAttribute("error", e.getMessage());
				/*target = targetError;*/
			}
			if (cbean.getConsumer_num()!= 0) {
				/*session.setAttribute("error", null);*/
				session.setAttribute("cbean", cbean);
				target = targetView;
			} else {
				session.setAttribute("cbean", null);
				/*session.setAttribute("error",
						"Sorry No data Found for given ID!");
				target = targetError;*/
			}
		}
	
	/*session.setAttribute("userbean", userbean);*/


	RequestDispatcher dispatcher = request.getRequestDispatcher(target);   
	dispatcher.forward(request, response);
	
	
		   }
	

}
	

