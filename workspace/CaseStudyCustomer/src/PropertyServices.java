
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertyServices {

			private Properties props;
			public PropertyServices() throws CustException {
				props=new Properties();
				
				try (
					FileInputStream fis=new FileInputStream("ProjectDb.Properties");)
					{
					props.load(fis);
				} catch (IOException e) {
					
					throw new CustException("Property File Missing",e);
				}
				
			}
			public String getPropertyValue(String propKey){
				return props.getProperty(propKey);
			}
}