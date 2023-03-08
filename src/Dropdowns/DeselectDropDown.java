package Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DeselectDropDown
{
	public static void main(String[] args) throws InterruptedException 
	{
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement dropdown=driver.findElement(By.id("cars"));
			Select s= new Select(dropdown);
			
			s.selectByVisibleText("Free ( 90 ) ");
			s.selectByIndex(1);
			s.selectByValue("199");
			
			if(s.isMultiple()) {
				s.deselectByIndex(0);
				Thread.sleep(2000);
				s.deselectByIndex(1);
				Thread.sleep(2000);
				s.deselectByValue("199");
				Thread.sleep(2000);
				s.deselectAll();
			}
			else
				System.out.println("Singleselect");
			driver.quit();
				
			}
}
			
		

