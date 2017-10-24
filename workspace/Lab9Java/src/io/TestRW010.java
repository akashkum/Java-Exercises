package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestRW010 {

	public static void main(String[] args) {
		String filePath = "P:\\Users\\vipulgup\\workspace\\Lab9Java\\src\\io";
		String fileName= "TestData.txt";
		FileReader fis=null;
		try {
			 fis=new FileReader(filePath+"\\"+fileName);
			int ch= fis.read();
			while (ch!=-1){
			System.out.println(ch);
			ch=fis.read();
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


