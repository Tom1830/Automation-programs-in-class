package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		//step 1 : convert physical file to java readable object
		//new FileInputStream throws FileNotFoundException
		FileInputStream fis=new FileInputStream("./Test Resources/DataDrivenTesting.properties");
		
		//Step 2: create a instance of properties class
		//properties class present in java.util package
		
		Properties property = new Properties();
		
		//step 3: load all key values pairs into properties object
		//the below statement throws IOException
		
		property.load(fis);
		
		//step 4: read data
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("browser"));
		System.out.println(property.getProperty("time"));
		System.out.println(property.getProperty("username"));
		System.out.println(property.getProperty("password"));
		
		
		
		
		
	}

}
