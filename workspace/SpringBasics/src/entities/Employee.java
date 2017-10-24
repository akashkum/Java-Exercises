package entities;

public class Employee {
	private int empno;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public Employee() {
		super();
		System.out.println("Employee Object Created");
	}

}
