import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("*.do")
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Sample() {
        super();
        
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:/OracleDS");
			Connection con = ds.getConnection();
			Statement st = ((java.sql.Connection) con).createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM emp");
			while (rs.next()) {
			PrintWriter pw=response.getWriter();
			pw.println(rs.getInt("EMPNO"));
			pw.println(rs.getString("ENAME") );
			pw.println(rs.getFloat("SAL"));
			}
			} catch (NamingException | SQLException e) {
			log("Error is::::::::::" + e.getMessage());
			}
		
	}
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
