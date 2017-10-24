package props;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertyServices020 {

		private Properties props;
		public PropertyServices020() throws IOException{
			props = new Properties();
			
	FileInputStream fis=new FileInputStream("Project.properties");
	props.load(fis);
			fis.close();
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



