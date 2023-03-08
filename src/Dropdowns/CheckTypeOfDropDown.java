package Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckTypeOfDropDown 
{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
	
		Select s=new Select(dropdown);
		s.selectByIndex(6);
		
		if(s.isMultiple())
		
			System.out.println("Single Select");
		
			else
			
				System.out.println("Multi Select");
				s.selectByIndex(5);
				Thread.sleep(2000);
				s.selectByValue("Digital Music");
				Thread.sleep(2000);
				s.selectByVisibleText("Sports & Outdoors");
				Thread.sleep(2000);
				driver.quit();
				
	}
}
			
		
		



