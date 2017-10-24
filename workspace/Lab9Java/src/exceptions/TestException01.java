// Try With Resources to reduce no. of lines in code.
//Order should be such that sub exception comes at the top to the most super exception at the bottom
package exceptions;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class TestException01 {
	public static void main(String[] args) {		
				try(FileReader reader =  new FileReader("abc.txt")){
					System.out.println("File Opened");
			}
	        catch(IOException e1){
				
				e1.printStackTrace();
			}	catch(Exception e2){//most super exception
				
			}
			System.out.println("bbbbb");
	}

}
