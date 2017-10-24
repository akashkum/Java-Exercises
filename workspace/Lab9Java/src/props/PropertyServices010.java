package props;

import java.util.Properties;
import java.util.Set;

public class PropertyServices010 {

		private Properties props;
		public PropertyServices010(){
			props = new Properties();
			
			props.setProperty("filePath","c:\\");
			props.setProperty("fileName","aaa.txt");
			
		}
	public String getPropValue(String prop)
	{
		return props.getProperty(prop);
		
	}
	public Set<Object> getPropKeys(){
		Set<Object> keys =props.keySet();
		return keys;
	}
	}



