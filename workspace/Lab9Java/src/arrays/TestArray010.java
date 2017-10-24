
//2 Dimensional Arrays

package arrays;

public class TestArray010 {
	public static void main(String[] args) {
		int[][] mat1=new int[2][3];
		int[][] mat2={{1,2,3},{4,5,6}};
		for(int rows=0; rows < mat2.length;rows++)
		{
			for(int cols=0;cols<mat2[rows].length;cols++)
			{
				System.out.print(mat2[rows][cols]+" ");
			}
			System.out.println();
		}

}
}