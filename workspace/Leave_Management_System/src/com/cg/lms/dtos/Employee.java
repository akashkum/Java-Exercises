package com.cg.lms.dtos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="employee_details")
public class Employee implements Serializable {
private static final long serialVersionUID = 1L;
	
	private int empid;
	private String ename;
	private String address;
	private int leaves_avail;
	
	
	@Id
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Column(name="ename")
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Column(name="address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name="leaves_avail")
	public int getLeaves_avail() {
		return leaves_avail;
	}
	public void setLeaves_avail(int leaves_avail) {
		this.leaves_avail = leaves_avail;
	}
	public Employee(int empid, String ename, String address, int leaves_avail) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.address = address;
		this.leaves_avail = leaves_avail;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", address="
				+ address + ", leaves_avail=" + leaves_avail + "]";
	}
	public Employee() {
		super();
	}
	
	

}
