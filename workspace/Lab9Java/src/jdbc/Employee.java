package jdbc;
public class Employee  {
	private int empNo;
	private String empNm;
	private float empSal;
	
	public Employee(int empNo, String empNm, float empSal) {
		super();
		this.empNo = empNo;
		this.empNm = empNm;
		this.empSal = empSal;
	}
	
	//this constructor is needed for auto generating empNo
	public Employee(String empNm, float empSal) {
		super();
		this.empNm = empNm;
		this.empSal = empSal;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empNm=" + empNm + ", empSal="
				+ empSal + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empNm == null) ? 0 : empNm.hashCode());
		result = prime * result + empNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empNm == null) {
			if (other.empNm != null)
				return false;
		} else if (!empNm.equals(other.empNm))
			return false;
		if (empNo != other.empNo)
			return false;
		return true;
	}
	

}
