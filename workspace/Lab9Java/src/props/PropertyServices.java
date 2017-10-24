package props;

import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

public class PropertyServices {

	private Properties props;
	public PropertyServices(){
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
