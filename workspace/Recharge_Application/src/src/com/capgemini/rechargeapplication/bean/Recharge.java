package src.com.capgemini.rechargeapplication.bean;

public class Recharge {
	private int rechargeId;
	private String operator;
	private int amount;
	private int validity;
	public int getRechargeId() {
		return rechargeId;
	}
	public void setRechargeId(int rechargeId) {
		this.rechargeId = rechargeId;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	@Override
	public String toString() {
		return "Recharge [rechargeId=" + rechargeId + ", operator=" + operator
				+ ", amount=" + amount + ", validity=" + validity + "]";
	}
	public Recharge(int rechargeId, String operator, int amount, int validity) {
		super();
		this.rechargeId = rechargeId;
		this.operator = operator;
		this.amount = amount;
		this.validity = validity;
	}
	
}
	