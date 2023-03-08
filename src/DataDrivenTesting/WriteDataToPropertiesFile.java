package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataToPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Test Resources/DataDrivenTesting.properties");
		Properties p =new Properties();
		p.load(fis);
		
		p.put("browser2", "edge");
		
		FileOutputStream fos=new FileOutputStream("./Test Resources/DataDrivenTesting.properties");
		p.store(fos,"updated successfully");

	}

}
