//Sorting the array and Searching the particular element in the array

package arrays;

import java.util.Arrays;

public class TestArray030 {
	public static void main(String[] args) {
		int[] empList={105,101,109,125,113,167,102};
		Arrays.sort(empList);
		for(int val :empList)
			System.out.print(val +" ");
		
		int position=Arrays.binarySearch(empList, 167);
		System.out.println(position);
		
	}

}
