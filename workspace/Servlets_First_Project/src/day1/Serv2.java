package day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/welcome.php")
public class Serv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   String title=null;
   

    public Serv2() {
        System.out.println("In constructor-Obj created");
       
    }
   @Override
   public void destroy(){
	   System.out.println("maintenece");
		  System.out.println("value is removed");
	   
   }
	@Override
	public void init() throws ServletException
	{title="NEW PAGE TITLE";
	  
	  System.out.println("value is initialized");
	  
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>" + title +  "</title></head>");
		out.println("<body>");
		int a=900;
		if(a==13){
			out.println("<h3>welcome to j2ee <h3>");
		}
		else
			
		{
			out.println("<h4>ThIS IS RESPONSE OBJECTIVE<h4>");
		}
		
		
		out.println("</body>");
		out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
	
@Override
 public void service(ServletRequest req,ServletResponse res) throws ServletException, IOException {
		super.service(req, res);
	}

	
}
