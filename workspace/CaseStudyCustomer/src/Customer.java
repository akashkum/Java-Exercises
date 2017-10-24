


public class Customer {
	int Cust_Id;
	String Gender;
	String Cust_Name;
	public int getCust_Id() {
		return Cust_Id;
	}
	public void setCust_Id(int cust_Id) {
		Cust_Id = cust_Id;
	}
	public String getCust_Name() {
		return Cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Customer(int Cust_id, String Cust_name, String gender) {
		super();
		this.Cust_Id=Cust_id;
		this.Cust_Name = Cust_name;
		this.Gender = gender;
	}
	
	
	public Customer(String Cust_name, String gender) {
		super();
		this.Cust_Name = Cust_name;
		this.Gender = gender;
	}
	
	@Override
	public String toString() {
		return "Customer [Customer Id=" + Cust_Id + ", Customer Name=" + Cust_Name + ", Gender="
				+ Gender + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cust_Name == null) ? 0 : Cust_Name.hashCode());
		result = prime * result + Cust_Id;
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
		Customer other = (Customer) obj;
		if (Cust_Name == null) {
			if (other.Cust_Name != null)
				return false;
		} else if (!Cust_Name.equals(other.Cust_Name))
			return false;
		if (Cust_Id != other.Cust_Id)
			return false;
		return true;
	}
	

}
