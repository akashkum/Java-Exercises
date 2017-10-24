package collects;
import java.util.HashSet;
import java.util.ListIterator;

public class TestCollectipon020 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet values=new HashSet();//It represents Hashtable and in it there is no specific order of values stored and duplicate values are only stored once
//In Hashset Searching and insertion is easy and fast
//For huge quantity of data use Hashset
values.add(20);
values.add(10);
values.add(25);
values.add(33);
values.add("hello");
values.add("hello");
values.add(40);
values.add(40);
		
	System.out.println(values);	
	//System.out.println(values.get(2));//get method is not applicable because hashtable does not work on basis of position or index
		
	System.out.println(values.contains("hello"));
	for(Object vls:values) // traversal of Hashset
	{
		System.out.println(vls);
	}
	
	//ListIterator it=values.listIterator();//NO LIST ITERATOR IN HASHSET
	//ITERATOR works HERE THOUGH
	
		
		
		
	}

}
