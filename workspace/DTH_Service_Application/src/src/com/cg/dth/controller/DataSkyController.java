package src.com.cg.dth.controller; /* Packages Imported*/
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import src.com.cg.dth.bean.Subscriber;
import src.com.cg.dth.dao.IQueryMapper;
import src.com.cg.dth.exception.DTHException;
import src.com.cg.dth.service.SubscriberServiceimpl;
import src.com.cg.dth.utility.DbConnection;

@WebServlet("*.do")
public class DataSkyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DataSkyController() {
		super();
		
	}
	/* DoGET Method Below*/
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");   
		dispatcher.forward(request, response);
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		SubscriberServiceimpl service = null;
		Subscriber sbean = null;
		String target = "";

		HttpSession session = request.getSession(true);/* Creating the Session*/
		
		sbean = new Subscriber(0, target, target, 0, null);
		service = new SubscriberServiceimpl();
		
		String targetView = "subAccDetails.jsp";   /* Different Targets designed for different pages*/
		
		String targetError = "error.jsp";
		
		String path = request.getServletPath().trim();

		switch(path)
		{
				
		case "/view.do":  /* This is used for viewing the Account Summary*/
		String mnumb=null;
			
			mnumb = request.getParameter("cnumb");
			
			try {
				System.out.println("helllo");
				sbean = service.getAccDetails(mnumb);
			} catch (DTHException e) {
				session.setAttribute("error", e.getMessage());/* Setting Error ATtribute in session with somew message*/
				target = targetError;
			}
			if (sbean.getMobile_number()!= null) {
				session.setAttribute("error", null);/* Setting Error ATtribute in session*/
				session.setAttribute("sbean", sbean);
				target = targetView;
			} else {
				session.setAttribute("sbean", null);
				session.setAttribute("error",
						"Sorry No data Found for given ID!");
				target = targetError;
			}
		
		PreparedStatement preparedStatement = null;
		/* Below process for Calculating the Recommended REcharge  -------*/
			try {
				Connection conn = null;
				ResultSet resultSet = null;
				
				conn = DbConnection.getConnection(); /* This is used for extracting the Package amount from other Table */
							preparedStatement = conn.prepareStatement("SELECT package_amount FROM datasky_packages WHERE package_id=?");
							preparedStatement.setString(1,sbean.getPackage_id());
							resultSet = preparedStatement.executeQuery();
							
							float ra=0;
							while(resultSet.next())
							{ra=resultSet.getInt(1)-sbean.getAccount_balance();}/* This is used for calculating the Recommended Recharge*/
							
							session.setAttribute("rr",ra);
			} catch (DTHException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			
break;
						 
	case "/recharge.do" : /* This is used for doing the Recharge and updating the details in the Table*/
		Date mydate=new Date();
		session.setAttribute("date", mydate.getTime());
		int amt=0;
		amt=Integer.parseInt(request.getParameter("amount").trim());
		Subscriber bean=(Subscriber) session.getAttribute("sbean");
		PreparedStatement stmt1 = null;
		long mob=0;
		mob=Long.parseLong(bean.getMobile_number());
		Connection conn1 = null;
		ResultSet resultSet1 = null;
			try {
				conn1 = DbConnection.getConnection();/* This is used for updating acc balance and Due Date*/
				String qry1 ="UPDATE subscriber_account_details SET account_balance= ? , rechargedate=rechargedate + 30 where mobile_number=? ";
				int recsAff=0;
						PreparedStatement stmt11=conn1.prepareStatement(qry1);
						
						stmt11.setFloat(1,amt);
						stmt11.setLong(2,mob);
							 recsAff=stmt11.executeUpdate();		 
							 	 
							 target="success.jsp"; /* success.jsp assigned to target*/
			} catch (DTHException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
				break;
		
		
		}
		
	RequestDispatcher dispatcher = request.getRequestDispatcher(target);  /* This is used for Dispatching to the next page*/ 
	dispatcher.forward(request, response);
	
	
		   }
		   
	

}
	

