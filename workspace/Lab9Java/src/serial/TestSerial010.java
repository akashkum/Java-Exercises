package serial;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import casestudy01.entities.Employee;

public class TestSerial010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(10001,"aaaa",5000);
		String filePath="P:\\Users\\vipulgup\\workspace\\Lab9Java\\src\\serial";
		String fileName="Employee.ser";
		File file=new File(filePath+"\\"+fileName);
		try (
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			){
			
		}catch (IOException e){
			e.printStackTrace();
			
		}

	}

}
