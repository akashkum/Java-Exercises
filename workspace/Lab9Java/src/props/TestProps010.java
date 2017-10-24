package props;

import java.util.Set;

public class TestProps010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyServices010 services=new PropertyServices010();
		System.out.println(services.getPropValue("filePath"));
		System.out.println(services.getPropValue("fileName"));		
     Set<Object> keys= services.getPropKeys();
     System.out.println(keys);
     }

}
