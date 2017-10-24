package com.cg.Online_Application.bean;

public class User {
	
	private String owner_name;
	private String businessname;
	private String emailid;
	private String mobileno;
	private String isactive;
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getBusinessname() {
		return businessname;
	}
	public void setBusinessname(String businessname) {
		this.businessname = businessname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
	public User(String owner_name, String businessname, String emailid,
			String mobileno, String isactive) {
		super();
		this.owner_name = owner_name;
		this.businessname = businessname;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.isactive = isactive;
	}
	@Override
	public String toString() {
		return "User [owner_name=" + owner_name + ", businessname="
				+ businessname + ", emailid=" + emailid + ", mobileno="
				+ mobileno + ", isactive=" + isactive + "]";
	}
	
	

}
