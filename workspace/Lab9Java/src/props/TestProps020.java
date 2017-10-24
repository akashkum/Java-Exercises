package props;

import java.io.IOException;

public class TestProps020 {
	public static void main(String[] args) {
		try{
			PropertyServices020 services = new PropertyServices020();
			System.out.println(services.getPropValue("filePath"));
			System.out.println(services.getPropValue("fileName"));
		}catch(IOException e)
		{ e.printStackTrace();
	}

}}
