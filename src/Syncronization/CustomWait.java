package Syncronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()=\"Start\"]")).click();
		
		int count=20;
		WebElement header = null;
		for(int i=0;i<count; i++)
		{
			try
			{
				header =driver.findElement(By.xpath("//h4[text()=\"Hello World!\"]"));
				break;
			}
			catch(Exception e)
			{
				Thread.sleep(1000);
			}
				
		}
		System.out.println(header.getText());
		driver.quit();
		}

	}


