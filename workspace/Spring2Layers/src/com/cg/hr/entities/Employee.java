package com.cg.hr.entities;

public class Employee {
	private int empNo;
	private String empNm;
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empNm=" + empNm + "]";
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

}
