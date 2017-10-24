package serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import casestudy01.entities.Employee;

public class TestSerial020 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath="P:\\Users\\vipulgup\\workspace\\Lab9Java\\src\\serial";
		String fileName="Employee.ser";
		File file=new File(filePath+"\\"+fileName);
		try (
			FileInputStream fos = new FileInputStream(file);
			ObjectInputStream oos=new ObjectInputStream(fos);
			){
			
			Employee emp=(Employee) oos.readObject();
			System.out.println(emp);
		}catch (IOException e){
			e.printStackTrace();
			
		} catch(ClassNotFoundException e1){
			e1.printStackTrace();
		}
	


}
}