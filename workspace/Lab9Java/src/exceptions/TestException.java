// Nested Try Catch
package exceptions;
import java.io.FileNotFoundException;

import java.io.FileReader;

public class TestException {
	public static void main(String[] args) {
		int a,b;
		a=10;
		b=0;
		System.out.println(a/b);
		if(b!=0)
			System.out.println(a/b);
		try{
		Class.forName("");
			try {
				FileReader reader = new FileReader("abc.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("FileOpened");		
		}
			catch(ClassNotFoundException e1 ){
				e1.printStackTrace();
		        return;
			}finally{
				System.out.println("File should be closed.");
			}
		
		System.out.println("bbbbb");
	}

}



