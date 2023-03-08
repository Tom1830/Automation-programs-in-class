package Tasks;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptInstagram 
{

	public static void main(String[] args)throws InterruptedException, IOException
     {
	            WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.instagram.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			WebElement LB_enable=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
			if(LB_enable.isEnabled())
			{
				System.out.println("Enabled");
			}
			else
			{
				System.out.println("At firstly Disabled");
				driver.findElement(By.name("username")).sendKeys("Sri");
				driver.findElement(By.name("password")).sendKeys("123456");
				
				if(LB_enable.isEnabled())
				{
					System.out.println("After you entered your credentials it is Enabled");
					LB_enable.submit();
				}
				else
				{
					System.out.println(" Still Disabled");
				}	
			}
	}
		
}
			

	


