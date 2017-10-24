package collects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class Test010 {

	public static void main(String[] args) {
		ArrayList<Integer> values=new ArrayList<>();//Type Safety done to only accepts integer values
		//constructor which accepts capacity AND giving Capacity is not mandatory for ArrayList,Then Implementation will decide the size
		//default Capacity of ArrayList is 16
		values.add(15);//15,20,10,25 etc. are objects whose refs(address) is getting passed to Object "Values" which stores the refs.
		values.add(20);
		values.add(10);
		values.add(25);
		values.add(33);
		values.add(35);
		values.add(40);
		values.add(40);
		//values.add("aaaa");//Error coming because we have done TypeSafety in the beginning while delaring ArrayList
		System.out.println(values);//prints complete arraylist
		//memory allocation od LinkedList is non-continuous and Allocation of memory in ArrayList is consecutive
		LinkedList lval=new LinkedList();
		//no constructor in LInkedlist to accept capacity
		// default is doubly linked list
		lval.add(20);
		lval.add(10);
		lval.add(25);
		System.out.println(lval);//prints complete linekdlist
		//Fucntions to get the values at particular Index
    System.out.println(values.get(3));
    System.out.println(lval.get(2)); //get method for ArrayList is faster because in get method of LinkedList it is going from node to node
	
    //To check whether the particular value exists in ArrayList/linkedlist or not
    System.out.println(values.contains(10));
	System.out.println(lval.contains(48));//returns boolean values true or false

	//Rudimentary Way for printing complete arraylist/linkedlist
	for(int i=0;i<values.size();i++)
	{
		System.out.println(values.get(i));
	}
	for(int i=0;i<lval.size();i++)
	{
		System.out.println(lval.get(i));
	}
	
	//new way of printing through FOR Eachloop
	for(Object vls:values)
	{
		System.out.println(vls);
	}
	
	for(Object vls:lval)
	{
		System.out.println(vls);
	
	}
	
	
	
//Using Iterator Class to print the values
	Iterator iterate=values.iterator(); 
	 while(iterate.hasNext())
	 {
		 System.out.println(iterate.next());
	 }
	 iterate=lval.iterator();
	 while(iterate.hasNext())
	 {
		 System.out.println(iterate.next());
	 }
	
	 
	 
	 // Using ListIterator to print the values
	ListIterator it=values.listIterator();
	while(it.hasNext())
	{
		System.out.println(it.next());//printiing in forward direction
	}
	while(it.hasPrevious())
	{
		System.out.println(it.previous()); //printing in reverse direction
	}
	values.forEach(v->System.out.println(v));//another way to print the arraylist
	
	}

}
