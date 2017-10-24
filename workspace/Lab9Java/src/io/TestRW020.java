package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestRW020 {

	public static void main(String[] args) {
		String filePath = "P:\\Users\\vipulgup\\workspace\\Lab9Java\\src\\io";
		String fileName= "TestData.txt";
		FileReader fis=null;
		BufferedReader reader=null;
		try {
			 fis=new FileReader(filePath+"\\"+fileName);
			reader=new BufferedReader(fis);
			String txtline=reader.readLine();
			while (txtline!=null){
			System.out.println(txtline);
			txtline=reader.readLine();
		} 
		fis.close();
	}catch (FileNotFoundException e) {
			e.printStackTrace();
		
	}catch(IOException e){
		e.printStackTrace();
	}
finally{
	try {
		if(fis !=null)
			fis.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
}



