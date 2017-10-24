package collects;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		HashMap< Integer, BankAcc> hMap=new HashMap<>();
		
		hMap.put(101,new BankAcc(1001,"aaaa",20000));
		hMap.put(1002,new BankAcc(1002,"bbbb",20000));
		hMap.put(1003,new BankAcc(1003,"cccc",20000));
		
		//System.out.println(hMap.get(101));
		
// *For Each* cannot be used to iterate because Iterator is not present internally in hashmap which is required for *For Each* to run
	
		
		Set<Integer> keys =hMap.keySet(); // Iteration method through Keys and then using get method
	for(int accNo : keys){
	System.out.println(hMap.get(accNo));
	}
	
	Collection<BankAcc> accs=hMap.values();//Iteratiion method directly printing Details
	for(BankAcc ba :accs){
		System.out.println(ba);
	}
	
	Set<Entry<Integer,BankAcc>> allAccs =hMap.entrySet();
	for(Entry<Integer,BankAcc> keyVal : allAccs){
		System.out.println(keyVal.getKey());
		System.out.println(keyVal.getValue());
		
	}
	
	
	
	
	}
}
