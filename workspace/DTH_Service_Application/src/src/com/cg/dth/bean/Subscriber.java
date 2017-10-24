package src.com.cg.dth.bean;

import java.util.Date;

public class Subscriber {
	
	private int subscriber_id;
	private String mobile_number;
	private String package_id;
	private float account_balance;
	private Date rechargedate;
	public int getSubscriber_id() {
		return subscriber_id;
	}
	public void setSubscriber_id(int subscriber_id) {
		this.subscriber_id = subscriber_id;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getPackage_id() {
		return package_id;
	}
	public void setPackage_id(String package_id) {
		this.package_id = package_id;
	}
	public float getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(float account_balance) {
		this.account_balance = account_balance;
	}
	public Date getRechargedate() {
		return rechargedate;
	}
	public void setRechargedate(Date rechargedate) {
		this.rechargedate = rechargedate;
	}
	public Subscriber(int subscriber_id, String mobile_number,
			String package_id, float account_balance, Date rechargedate) {
		super();
		this.subscriber_id = subscriber_id;
		this.mobile_number = mobile_number;
		this.package_id = package_id;
		this.account_balance = account_balance;
		this.rechargedate = rechargedate;
	}
	@Override
	public String toString() {
		return "Subscriber [subscriber_id=" + subscriber_id
				+ ", mobile_number=" + mobile_number + ", package_id="
				+ package_id + ", account_balance=" + account_balance
				+ ", rechargedate=" + rechargedate + "]";
	}
	
	}
	
	

