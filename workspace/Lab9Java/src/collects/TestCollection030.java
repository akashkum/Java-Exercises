package collects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class TestCollection030 {
	public static void main(String[] args) {
		//HashSet aList=new HashSet();
		//add method of Hashset uses Equals Method internally
		//Equals and Hashset methods already are overridden in Wrapper Classes and String Classes.
		LinkedHashSet aList=new LinkedHashSet();//It gives the same order of insertion of values given by user
		aList.add(new BankAcc(1001,"aaaa",20000));
		aList.add(new BankAcc(1001,"aaaa",20000));
		aList.add(new BankAcc(1002,"bbbb",30000));
		aList.add(new BankAcc(1003,"cccc",40000));
		aList.add(new BankAcc(1008,"tttt",70000));
		aList.add(new BankAcc(1004,"dddd",50000));
	System.out.println(aList);
	System.out.println(aList.contains(new BankAcc(1008,"tttt",70000)));
	
	

	
	}
	}


