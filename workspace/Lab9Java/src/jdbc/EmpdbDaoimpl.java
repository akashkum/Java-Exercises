package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
public class EmpdbDaoimpl implements EmpdbDao {
private Connection connect;
static Logger myLogger=Logger.getLogger("myLogger");
public EmpdbDaoimpl() throws EmpException{
	ConnectionUtil util = new ConnectionUtil();
	connect=util.getConnection();
	myLogger.log(Level.INFO,"Connection proccured in EMpdbDaoImpl.");
	
}
	@Override
	public ArrayList<Employee> getEmpList() throws Exception {
		ArrayList<Employee> empList=new ArrayList<>();
		myLogger.info("Execution in getEmpList() .");
		String qry="SELECT * FROM EMP";
		try(Statement stmt=connect.createStatement();
				
				//3.Create Resultset
				ResultSet rs=stmt.executeQuery("SELECT * FROM EMP ");
				
				) {
			myLogger.info("Connection execution. " +qry);
			
			while(rs.next()){
					int empno=rs.getInt("EMPNO");
					String empNm=rs.getString("ENAME");
					float empSal=rs.getFloat("SAL");
					empList.add(new Employee(empno,empNm,empSal));
					//System.out.println(empno + "\t" + empNm +"\t"+empSal);
			
		}
		}catch (SQLException e) {
			myLogger.error("execution from getemplist()");
			throw new EmpException("problem in reading data",e);
		}
		return empList;
	}
	
	@Override
	public Employee getEmpOnId(int empNo) throws Exception {
		Employee emp=null;
		ResultSet rs=null;
		String qry="Select EMPNO,ENAME,SAL from EMP where EMPNO = ?";
		myLogger.info("Execution in getEmpOnId()");
		try(
		PreparedStatement stmt=connect.prepareStatement(qry);
				){
			myLogger.info("Query execution. " +qry);
		stmt.setInt(1,empNo);
		
		 rs=stmt.executeQuery();
		
	if(rs.next())
	{
		String empNm=rs.getString("ENAME");
		float empSal=rs.getFloat("SAL");
		emp =new Employee(empNo,empNm,empSal);
	}}catch (SQLException e) {
		throw new EmpException("problem in reading data",e);
		}finally{
			try {
				if(rs!=null)
					rs.close();
			} catch (SQLException e) {
				throw new EmpException("problem in closing resources",e);
			}
			
		}
		
		return emp;
	}
/*	@Override
	public boolean addNewEmp(Employee emp) throws EmpException {
		String qry="INSERT INTO Emp(EmpNo,ename,sal)values (?,?,?)";
		int recsAffected=0;
		try(
		PreparedStatement stmt=connect.prepareStatement(qry);
				){
		stmt.setInt(1,emp.getEmpNo());
		stmt.setString(2,emp.getEmpNm());
		stmt.setFloat(3,emp.getEmpSal());
		
		 recsAffected=stmt.executeUpdate();//1 for Successfull Insert
		
	}catch (SQLException e) {
		throw new EmpException("problem in inserting data",e);
		}
		return (recsAffected==1) ? true : false ;
	}
	
	
	*/

	
	@Override
	public boolean addNewEmp(Employee emp) throws EmpException {
		String qry="INSERT INTO Emp(EmpNo,ename,sal)values (AUTOEMPNO.nextval,?,?)";
		int recsAffected=0;
		try(
		PreparedStatement stmt=connect.prepareStatement(qry);
				){
		
		stmt.setString(1,emp.getEmpNm());
		stmt.setFloat(2,emp.getEmpSal());
		
		 recsAffected=stmt.executeUpdate();//1 for Successfull Insert
		
	}catch (SQLException e) {
		throw new EmpException("problem in inserting data",e);
		}
		return (recsAffected==1) ? true : false ;
	}
	
	public void close() throws EmpException{
		try {
			if(connect !=null)
				connect.close();
		} catch (SQLException e) {
			throw new EmpException("problem in closing connection",e);
		}}


}
