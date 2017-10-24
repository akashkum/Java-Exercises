package src.com.cg.ebill.bean;

public class BillDetails {

	private int bill_num;
	private int consumer_num;
	private float cur_reading;
	private float unitconsumed;
	private float netamount;
	@Override
	public String toString() {
		return "BillDetails [bill_num=" + bill_num + ", consumer_num="
				+ consumer_num + ", cur_reading=" + cur_reading
				+ ", unitconsumed=" + unitconsumed + ", netamount=" + netamount
				+ "]";
	}
	public BillDetails(int bill_num, int consumer_num, float cur_reading,
			float unitconsumed, float netamount) {
		super();
		this.bill_num = bill_num;
		this.consumer_num = consumer_num;
		this.cur_reading = cur_reading;
		this.unitconsumed = unitconsumed;
		this.netamount = netamount;
	}
	public int getBill_num() {
		return bill_num;
	}
	public void setBill_num(int bill_num) {
		this.bill_num = bill_num;
	}
	public int getConsumer_num() {
		return consumer_num;
	}
	public void setConsumer_num(int consumer_num) {
		this.consumer_num = consumer_num;
	}
	public float getCur_reading() {
		return cur_reading;
	}
	public void setCur_reading(float cur_reading) {
		this.cur_reading = cur_reading;
	}
	public float getUnitconsumed() {
		return unitconsumed;
	}
	public void setUnitconsumed(float unitconsumed) {
		this.unitconsumed = unitconsumed;
	}
	public float getNetamount() {
		return netamount;
	}
	public void setNetamount(float netamount) {
		this.netamount = netamount;
	}
	
	
}
