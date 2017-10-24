package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestRW030 {
	public static void main(String[] args) {
		String filePath = "P:\\Users\\vipulgup\\workspace\\Lab9Java\\src\\io";
		String fileNameR= "TestData.txt";
		String fileNameW= "TestDataW.txt";
		
		try (
			FileReader fis=new FileReader(filePath+"\\"+fileNameR);
			BufferedReader reader=new BufferedReader(fis);
				FileWriter fw=new FileWriter(filePath+"\\"+fileNameW);
			
				BufferedWriter writer=new BufferedWriter(fw);
				
				
				)
			{
			String txtline=reader.readLine();
			while (txtline!=null){
				writer.write(txtline);
			//System.out.println(txtline);
			txtline=reader.readLine();
			
			
		} 
		System.out.println("File Copy Completed Succeessfully");
	}catch (FileNotFoundException e) {
			e.printStackTrace();
		
	}catch(IOException e){
		e.printStackTrace();
	}

		
	
}
}


