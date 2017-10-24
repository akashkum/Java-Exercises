//Arrays in Java
package arrays;

public class TestArray {
	public static void main(String[] args) {
		
		  
		int[] vals=new int[5];
		for(int i=0; i<5 ; i++)
		{
			System.out.println(vals[i]);
		}
		int[] days={31,26,47,78,55,43};
		for(int val : days){
			
			System.out.println(val);
			
		}
	}

}
