package collects;

import java.util.TreeSet;

public class TestCollection040 {
public static void main(String[] args) {
	TreeSet values=new TreeSet();//TreeSet Displays the values in ascending order and unique values only
	values.add(20);
	values.add(10); // No need to use CompareTo because its easy to compare Int
	values.add(25);
	values.add(33); 
	values.add(66);
	values.add(40);
	System.out.println(values);
	
	//GET METHOD WILLNOT WORK AND LIST ITERATOR WILL ALSO NOT WORK
	
	TreeSet aList=new TreeSet();
	//Need To use CompareTo method  which is mentioned in comments in previous files because here Treeset will compare the every values inserted by user.
	//Comparison on Identity only ex. BankAccNo.
	aList.add(new BankAcc(1001,"aaaa",20000)); 
	aList.add(new BankAcc(1001,"aaaa",20000));
	aList.add(new BankAcc(1002,"bbbb",30000));
	aList.add(new BankAcc(1003,"cccc",40000));
	aList.add(new BankAcc(1008,"tttt",70000));
	aList.add(new BankAcc(1004,"dddd",50000));
	
	System.out.println(aList);
	//comparator is given preference over Comparable
	
	//In case of TreeSet More the number of data,more the depth of tree, more time it takes for Searching, Therefore HashSet is more Efficient for huge chunk of Data.
	
}
}
