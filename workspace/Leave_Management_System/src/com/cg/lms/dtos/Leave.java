package com.cg.lms.dtos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="employee_leave_details")
public class Leave implements Serializable {
private static final long serialVersionUID = 1L;
	
	private int leave_id;
	private int empid;
	private Date start_date;
	private Date end_date;
	private String description;
	private int leaves_applied;
	
	
	public Leave() {
		super();
	}
	public Leave(int leave_id, int empid, Date start_date, Date end_date,
			String description, int leaves_applied) {
		super();
		this.leave_id = leave_id;
		this.empid = empid;
		this.start_date = start_date;
		this.end_date = end_date;
		this.description = description;
		this.leaves_applied = leaves_applied;
	}
	@Override
	public String toString() {
		return "Leave [leave_id=" + leave_id + ", empid=" + empid
				+ ", start_date=" + start_date + ", end_date=" + end_date
				+ ", description=" + description + ", leaves_applied="
				+ leaves_applied + "]";
	}
	
	@Id
	public int getLeave_id() {
		return leave_id;
	}
	public void setLeave_id(int leave_id) {
		this.leave_id = leave_id;
	}
	@Column(name="empid")
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Temporal(TemporalType.DATE)
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	@Temporal(TemporalType.DATE)
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	@Column(name="description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="leaves_applied")
	public int getLeaves_applied() {
		return leaves_applied;
	}
	public void setLeaves_applied(int leaves_applied) {
		this.leaves_applied = leaves_applied;
	}
	
	
}
