package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC010 {

	public static void main(String[] args) {
		//String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String userName="system";
		String password="sys";
		
		try(
				//Class.forName(driver);
			Connection connect=DriverManager.getConnection(url,userName,password);
			
			//2.Create Statement-Needed to do some configuration
			
			Statement stmt=connect.createStatement();
			
			//3.Create Resultset
			ResultSet rs=stmt.executeQuery("SELECT * FROM EMP ");
				) {
			//1.Open a Connection
			
			
			//4.tRAVERSE Resultset 
			while(rs.next()){
				int empno=rs.getInt("EMPNO");
				String empNm=rs.getString("ENAME");
				float empSal=rs.getFloat("SAL");
				
				System.out.println(empno + "\t" + empNm +"\t"+empSal);
				
				
			}
		} /*catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */ catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
