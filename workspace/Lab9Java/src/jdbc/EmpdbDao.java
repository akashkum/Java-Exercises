package jdbc;

import java.util.ArrayList;

public interface EmpdbDao {
	
	ArrayList<Employee> getEmpList() throws Exception; 
	Employee getEmpOnId(int empNo) throws Exception;
	 boolean addNewEmp(Employee emp) throws EmpException;
	void close() throws Exception;
}
