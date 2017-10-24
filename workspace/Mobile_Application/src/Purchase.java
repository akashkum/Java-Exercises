import java.util.Date;
public class Purchase  {
	private int purchaseid;
	private String cname;
	private String mailid;
	private String phoneno;
	private Date purchasedate;
	private int mobileid;
	
	
	
	public int getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(int purchaseid) {
		this.purchaseid = purchaseid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public Date getPurchasedate() {
		return purchasedate;
	}
	public void setPurchasedate(Date purchasedate) {
		this.purchasedate = purchasedate;
	}
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + purchaseid;
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
		Purchase other = (Purchase) obj;
		if (purchaseid != other.purchaseid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Purchase [purchaseid=" + purchaseid + ", cname=" + cname
				+ ", mailid=" + mailid + ", phoneno=" + phoneno
				+ ", purchasedate=" + purchasedate + ", mobileid=" + mobileid
				+ "]";
	}
	public Purchase(String cname, String mailid,String phoneno,int mobileid) {
		super();
		
		this.cname = cname;
		this.mailid = mailid;
		this.phoneno = phoneno;
		
		this.mobileid = mobileid;
	}
	
	
	
	
	
	

}
