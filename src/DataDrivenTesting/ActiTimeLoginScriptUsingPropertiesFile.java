package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


public class ActiTimeLoginScriptUsingPropertiesFile {

	public static void main(String[] args) throws IOException {
		 
		FileInputStream fis = new FileInputStream("./Test Resources/DataDrivenTesting.properties");
		Properties p =new Properties();
		p.load(fis);
		
		WebDriver driver=null;
		switch(p.getProperty("browser"))
		{
		case "chrome":driver=new ChromeDriver();
		break;
		case "edge":driver=new EdgeDriver();
		break;
		}
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		long time = Long.parseLong(p.getProperty("time"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.findElement(By.id("username"))
		.sendKeys(p.getProperty("username")+Keys.TAB+p.getProperty("password")+Keys.ENTER);
		
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		boolean status=Wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		if(status)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.quit();
	}
}
		
		
		
		
	