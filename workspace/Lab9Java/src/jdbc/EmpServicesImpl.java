package jdbc;

import java.util.ArrayList;

import org.apache.log4j.Logger;

public class EmpServicesImpl implements EmpServices {
private EmpdbDao dao;
static Logger myLogger=Logger.getLogger("myLogger");
public EmpServicesImpl() throws EmpException{
	myLogger.info("Service : Dao Injected ");
	dao=new EmpdbDaoimpl();
}
	@Override
	public ArrayList<Employee> getEmpList() throws Exception {
		// TODO Auto-generated method stub
		return dao.getEmpList();
		
	}

	@Override
	public Employee getEmpOnId(int empNo) throws Exception {
		// TODO Auto-generated method stub
		return dao.getEmpOnId(empNo);
	}

	@Override
	public boolean addNewEmp(Employee emp) throws EmpException {
		// TODO Auto-generated method stub
		return dao.addNewEmp(emp);
	}

	@Override
	public void close() throws EmpException {
		System.out.println("Closing Resources");
		myLogger.info("Service : Dao Closed");
		
			try {
				dao.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
