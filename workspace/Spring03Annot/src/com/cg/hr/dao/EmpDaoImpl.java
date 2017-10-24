package com.cg.hr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.hr.entities.Employee;
import com.cg.hr.exceptions.EmpException;


/*Component is a super Annotation for 
1.@Service : For SErvice Beans
2.@Repository : For DAO classes
3.@Controller : For controller classes
4.@Rest Controller : For Publishing REST ful services.*/


/*The sub annotations are for documentation purpose only just to document nature of a bean.*/


//@Component("empDao")
@Repository("empDao")
@Scope("singleton") //prototype
@Lazy(false)
public class EmpDaoImpl implements EmpDao {
    @Autowired     
	private DataSource dataSource;
         
		public EmpDaoImpl(){
			//Procure Data Source
			
			System.out.println("In constructor of EmpDaoImpl");
		}
		
		
		
	@Override
	public List<Employee> getAllEmps() throws EmpException {
		System.out.println("In getAllEmps() of EmpDaoImpl");
		List<Employee> empList =new ArrayList<>();
		try(Connection connect=dataSource.getConnection();
				Statement stmt=connect.createStatement();
				ResultSet rs=stmt.executeQuery("SELECT empno,ename,sal from emp ");
				){
			while(rs.next()){
				int empNo=rs.getInt("empno");
				String empNm=rs.getString("ename");
				float empSal=rs.getFloat("sal");
				Employee emp=new Employee(empNo,empNm,empSal);
				
				
				empList.add(emp);
			}
		}catch(SQLException e)
		{
			throw new EmpException("Problem in getAllEmps()",e);
		}
		return empList;
	}



	public Employee getEmpOnId(int empNo) throws EmpException {
		Employee emp11=new Employee(empNo, null, empNo);
		try(Connection connect=dataSource.getConnection();
				Statement stmt=connect.createStatement();
				ResultSet rs=stmt.executeQuery("SELECT empno,ename,sal from emp where empno =?");
				/*stmt.setInt(1,empNo);*/      ){
			while(rs.next()){
				int empNo1=rs.getInt("empno");
				String empNm1=rs.getString("ename");
				float empSal1=rs.getFloat("sal");
				emp11=new Employee(empNo1,empNm1,empSal1);
			}
		}catch(SQLException e)
		{
			throw new EmpException("Problem in getEmpOnId()",e);
		}
		return emp11;
		
		
	}




}
