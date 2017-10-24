package com.cg.hr.entities;

public class Employee {

		private int empNo;
		private String empNm;
		private float empSal;
		
		
		public Employee(int empNo, String empNm, float empSal) {
			super();
			this.empNo = empNo;
			this.empNm = empNm;
			this.empSal = empSal;
		}

		public float getEmpSal() {
			return empSal;
		}

		public void setEmpSal(float empSal) {
			this.empSal = empSal;
		}

		
		@Override
		public String toString() {
			return "Employee [empNo=" + empNo + ", empNm=" + empNm
					+ ", empSal=" + empSal + "]";
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
