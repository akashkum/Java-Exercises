// Passing Array to another method and overloading concept
package arrays;
public class TestArray040 
{
	public static void main(String[] args)
	{
		abc(5,10,15);
		int[] values ={1,2,3,4,5,6};
		pqr(values);
	}
	
	public static void abc(int... val1) //overloading concept(Short Method) , If Variable parameters like in this case has to be passed then it should be the last input of the method
	{for(int val :val1)
		System.out.println(val);
		
	}
	
	public static void pqr(int[] values)// passing array base address
	{for(int val :values)
		System.out.println(val);
		
	}
	

	/*
     public static void abc(int val1,int val2,int val3) //  Long Method
     {
	System.out.println("Value1 : " +val1);
	System.out.println("Value2 : " +val2);
	System.out.println("Value3 : " +val3); 
     }
	
	*/
}
