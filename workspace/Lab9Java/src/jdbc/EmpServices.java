package jdbc;

import java.util.ArrayList;

public interface EmpServices extends AutoCloseable {
	ArrayList<Employee> getEmpList() throws Exception; 
	Employee getEmpOnId(int empNo) throws Exception;
	 boolean addNewEmp(Employee emp) throws EmpException;
	void close() throws EmpException;
}
