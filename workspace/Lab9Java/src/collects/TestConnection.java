package collects;

import java.util.ArrayList;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BankAcc> aList=new ArrayList<>();//Generics : Type Safety Done to only accepts BankAcc Objects
		aList.add(new BankAcc(1001,"aaaa",20000));
		aList.add(new BankAcc(1002,"bbbb",30000));
		aList.add(new BankAcc(1003,"cccc",40000));
		aList.add(new BankAcc(1004,"dddd",50000));
		
       System.out.println(aList);
       System.out.println(aList.contains(new BankAcc(1003,"cccc",40000)));
	}

	

	
}
class BankAcc implements Comparable //Comparable used for TreeSet because TreeSEt compares the vaues inserted by user similarly to BST and it becomes difficult for user to compare objects until and unless Comparator used
{
	private int accNo;
	private String accNm;
	private float accBal;
	
	
	
	public BankAcc(int accNo,String accNm,float accBal)
	{
		super();
		this.accNo=accNo;
		this.accNm=accNm;
		this.accBal=accBal;
		
	}

    @Override
    public boolean equals(Object obj) //writing equal method because contains method fails if we directly write without equal function because here there are so many attributes in an object
    {
    	BankAcc ba=(BankAcc) obj;
    	int accNo2=ba.accNo;
    	return(accNo==accNo2) ? true :false;
    	
    }

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal="
				+ accBal + "]";
	}
	
	@Override
	public int hashCode(){
		return accNo;
		
	}

	@Override
	public int compareTo(Object arg0) {
		int accN = ((BankAcc) arg0).accNo;
		// TODO Auto-generated method stub
		return accNo<accN? -1 : accNo == accN ? 0 : 1;
	}
	
}

