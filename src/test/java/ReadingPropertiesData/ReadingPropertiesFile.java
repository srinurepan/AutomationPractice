package ReadingPropertiesData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException   {
		
		 //location of the properties file
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties");	
	
		Properties propertiesObj=new Properties();
		propertiesObj.load(file);  //before reading load the data(file)
	
	//Reading data from properties file
		
		String url = propertiesObj.getProperty("appurl");
		String mail = propertiesObj.getProperty("email");
		String pswd = propertiesObj.getProperty("password");
		String ordid = propertiesObj.getProperty("orderid");
		String custId = propertiesObj.getProperty("customerid");
	
	System.out.println(url+" "+mail+" "+pswd+" "+ordid+" "+custId);
	
	
	    //reading all the keys from properties file
	
	 Set<String> keys = propertiesObj.stringPropertyNames(); // this is set collection
	
	System.out.println(keys); // print like(appurl,email,password,orderid,customerid)
	
	
	              //or
	//Set<Object> keys = propertiesObj.keySet();   //object collection
	
	//System.out.println(keys);

	
	
	  //reading all the values from properties file
	
	Collection<Object> values = propertiesObj.values();  //print  only values
	
	System.out.println(values);
	
	}

}
